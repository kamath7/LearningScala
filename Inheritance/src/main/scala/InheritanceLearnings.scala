object InheritanceLearnings extends App{

  class Animal{
    protected  def eat = print("Nom Nom chompy")
  }

  class Dog extends  Animal{
    def Crunch = {
      eat
      print("Crunchy!!")
    }
  }
  val dog = new Dog

  dog.Crunch
}

//single class inheritance
