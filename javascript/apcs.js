
$(function() {

    // Stellar.js
    $.stellar.positionProperty.transfade = {
      setPosition: function(element, newLeft, originalLeft, newTop, originalTop) {
        var distance = newTop - originalTop;
        var rate = $(window).height() / 7;
        element.css('transform', 'translate3d(0, ' + distance + 'px, 0');
        element.css('opacity', 1 + (distance / rate));
      }
    };
    $(window).stellar({ positionProperty: 'transfade' });

    // Converts milliseconds to relative time format
    function timeAgo(milliseconds) {
      var convert = {
        'sec': secs = 1000,
        'min': mins = secs * 60,
        'hr': hours = mins * 60,
        'day': days = hours * 24,
        'week': weeks = days * 7,
        'month': months = weeks * 4,
        'year': years = months * 12
      }
      for (var k in convert) {
        if (convert.hasOwnProperty(k)) {
          if (milliseconds > convert[k]) {
            var unit = k; // set "record"
          } else {
            var name = (milliseconds < convert[unit]*2) ? unit : unit+'s';
            return Math.round(milliseconds/convert[unit]) + ' ' + name + ' ago';
          }
        }
      }
    }

    // JSON urls and values to get API timestamps from
    var api = {
      'dropbox': {
        'url': 'http://rothanak.x10.mx/dropbox/kgdz131pl8cnoad/AADc1DUR-f_TW_VY-TfoKOBIa',
        'value': 'last_modified'
      },
      'github': {
        'url': 'https://api.github.com/repos/rolliam/apcs',
        'value': 'pushed_at'
      }
    };

    // Display relative time from each API
    for (var key in api) {
      if (api.hasOwnProperty(key)) {
        (function(key,api) {
          $.get(api.url, function(data) {

            // Get time field from json
            var time = data[api['value']];

            // Already in relative time?
            var pattern = /^[0-9]+\s{1}[a-z]+\sago/;
            time = !time.match(pattern) ? timeAgo(new Date-new Date(time)) : time;

            // Replace [data-api] field with relative time
            $('[data-api="' + key + '"]').text(time);

          });
        })(key,api[key]);
      }
    }

});

// Bootstrap
$("[data-toggle=tooltip]").tooltip();