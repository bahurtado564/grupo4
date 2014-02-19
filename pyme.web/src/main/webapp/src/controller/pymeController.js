define(['controller/_pymeController'], function() {
    App.Controller.PymeController = App.Controller._PymeController.extend({

postInit: function(options) {
            var self = this;
            this.searchTemplate = _.template($('#pymeSearch').html()+$('#pymeList').html());
 
            Backbone.on(this.componentId + '-' + 'toolbar-search', function(params) {
                self.search(params);
            });
            Backbone.on(this.componentId+'-pyme-search', function(params) {
                self.pymeSearch(params);
            });
             Backbone.on('user-model-error', function(params) {
                var error = params.error;
                Backbone.trigger(self.componentId + '-' + 'error', 
                         {event: 'user-model', view: self, error:{ responseText: error}});
            });
        }
    });
    return App.Controller.PymeController;
}); 