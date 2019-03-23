
// 03-23-2019
// Daily Coding Problem #120 [Medium]

// Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances. 
// And in every even call of getInstance(), return the first instance and in every odd call of getInstance(), return the second instance.

// so this is just a basic example of an object literal singleton in JS

var user = {
    firstName : 'Mike',
    lastName : 'Santoro',
    sayName : function() {
        return this.firstName + ' ' + this.lastName;
    }
};