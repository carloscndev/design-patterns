'use strict'

let _singleton = null

class Singleton {
  constructor(data){
    if(!_singleton){
      this.data = data
      _singleton = this
    }
    else
      return _singleton

    console.log("Singleton class created")
  }

  singletonOperation(){
    console.log("Singleton Operation")
  }

  getSingletonData(){
    return this.data
  }
}

function init_Singleton(){
  var singleton1 = new Singleton("Data 1")
  var Singleton2 = new Singleton("Data 2")

  console.log(singleton1.getSingletonData())
  console.log(Singleton2.getSingletonData())
  console.log(singleton1 instanceof Singleton)
  console.log(Singleton2 instanceof Singleton)
  console.log(singleton1 === Singleton2)
}

init_Singleton()
