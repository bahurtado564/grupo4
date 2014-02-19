define(['model/_productModel'], function() {
    App.Model.ProductModel = App.Model._ProductModel.extend({
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
            if (attrs.value === '') {
                return "El atributo no puede ser vacio";
            }
            if (attrs.unidades === '') {
                return "El atributo no puede ser vacio";
            }
            
        }
    });

    App.Model.ProductList = App.Model._ProductList.extend({
        model: App.Model.ProductModel
    });

    return  App.Model.ProductModel;

});