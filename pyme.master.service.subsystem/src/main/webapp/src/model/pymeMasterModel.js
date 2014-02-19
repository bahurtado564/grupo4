define(['model/_pymeMasterModel'], function() { 
    App.Model.PymeMasterModel = App.Model._PymeMasterModel.extend({
initialize: function() {
            this.on('invalid', function(model,error) {
                Backbone.trigger('user-master-model-error', error);
            });
        },
        validate: function(attrs, options){
            return new App.Model.UserModel().validate(attrs.userEntity,options);
        }
    });

    App.Model.PymeMasterList = App.Model._PymeMasterList.extend({
        model: App.Model.PymeMasterModel
    });

    return  App.Model.PymeMasterModel;
    
});