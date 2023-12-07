function Person(name,age,mobile)
{
    this.name=name
    this.age=age
    this.mobile=mobile

    this.setName=function(name)
    {
        this.name=name
    }
    this.getName=function()
    {
        return this.name
    }

}

p1=new Person("Lion",23,"234742537")
p2=new Person("Tiger",25,"634742537")

console.log(p1)
console.log(p2)


let person={
    name:"Umesh",
    age:56,
    mobile:"456787877",

    getName:function()
    {
        return this.name
    },

    setName:function(name)
    {
        this.name=name
    }

}


console.log("Age=",person.age)
console.log("Name=",person.getName())

person.city="Pune"




