define([], function() {
   
//    App.Delegate._PymeDelegate = App.Delegate.PymeDelegate || {
//        
//        
//    };

    App.Delegate.PymeDelegate = {
 
        search: function(Pyme, callback, callbackError) {
            console.log('Pyme Search: ');
            $.ajax({
                url: '/pyme.service.subsystem.web/webresources/Pyme/search',
                type: 'POST',
                data: JSON.stringify(pyme),
                contentType: 'application/json'
            }).done(_.bind(function(data) {
                callback(data);
            }, this)).error(_.bind(function(data) {
                callbackError(data);
            }, this));
        }
    };
});