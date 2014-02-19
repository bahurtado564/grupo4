define(['model/_clientModel'], function() {
    App.Model.ClientModel = App.Model._ClientModel.extend({
         initialize:function(parameters){
            this.on('invalid',function(model,error){
                Backbone.trigger('client-model-error', {error: error});
            });
        },
 
        validate: function(attrs, options) {
            if (attrs.nombre === '') {
                return "El atributo no puede ser vacio";
            }
            if (attrs.sexo === '') {
                return "El atributo no puede ser vacio";
            }
            if (attrs.edad === ''&& attrs.edad <= 100 && attrs.edad >= 1 && attrs.edad.valueOf()!== String ) {
                return "El atributo no puede ser vacio";
            }
            if (attrs.cc === '' && attrs.cc <= 10000000000 && attrs.cc >= 1 && attrs.cc.valueOf()!== String) {
                return "El atributo no puede ser vacio";
            }
            
        }
    });

    App.Model.ClientList = App.Model._ClientList.extend({
        model: App.Model.ClientModel
    });

    return  App.Model.ClientModel;

});