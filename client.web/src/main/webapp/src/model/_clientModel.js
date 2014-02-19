define([], function() {
    App.Model._ClientModel = Backbone.Model.extend({
        defaults: {
 
		 'name' : ''
 ,  
		 'cc' : '',
                 
                 'sexo' : '',
                 
                 'edad' : ''
        },
        initialize: function() {
        },
        getDisplay: function(name) {
         return this.get(name);
        }
    });

    App.Model._ClientList = Backbone.Collection.extend({
        model: App.Model._ClientModel,
        initialize: function() {
            if(self.postInit){
                self.postInit();
            }
        }

    });
    return App.Model._ClientModel;
});