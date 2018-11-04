'use strict'

class Singleton {

    static instance
    
    constructor(){
        if(intance){
           return instance
        }
        this.instance = this
    }
}


let first = new Singleton()
let second = new Singleton()

console.log(first === second)