define(['model/_pymeModel'], function() {
    App.Model.PymeModel = App.Model._PymeModel.extend({
        initialize:function(parameters){
            this.on('invalid',function(model,error){
                Backbone.trigger('user-model-error', {error: error});
            });
        },
 
        validate: function(attrs, options) {
            if (attrs.name === '') {
                return "El atributo no puede ser vacio";
            }
            if (attrs.description === '') {
                return "El atributo no puede ser vacio";
            }
            if (attrs.sector === '') {
                return "El atributo no puede ser vacio";
            }
            if (attrs.propietario === '') {
                return "El atributo no puede ser vacio";
            }
            
        }
        
    });

    App.Model.PymeList = App.Model._PymeList.extend({
        model: App.Model.PymeModel
    });

    return  App.Model.PymeModel;

});