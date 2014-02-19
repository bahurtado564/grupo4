define([], function() {
    App.Model._PymeMasterModel = Backbone.Model.extend({
     
    });

    App.Model._PymeMasterList = Backbone.Collection.extend({
        model: App.Model._PymeMasterModel,
        initialize: function() {
            Backbone.on('user-master-model-error', function(error) {
                Backbone.trigger(uComponent.componentId + '-' + 'error', {event: 'user-master-save', view: self, error: {responseText:error}});
            });
        }

    });
    return App.Model._PymeMasterModel;
    
});