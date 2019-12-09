*javascript 개념

식별자 -  변수, 상수, 클래스, 인터페이스, 패키지 등과 같은 개체(entity)의 이름을 붙일 때

*ECMAScript6 에 대한 내용

1) Class 문법을 제공. constructor 메소드도 사용할 수 있고 extends를 통해서 클래스 상속도 가능.

~~~
class Person {
    constructor (id, name) {
        this.id = id
        this.name = name
    }
    toString() {
        return `(${this.id}, ${this.name})`
    }
}

class Student extends Person {
    constructor (id, name, age) {
        super(id, name)
        this.age = age
    }
    toString() {
        return super.toString() + ' and ' + this.age
    }
}
~~~

2) const 는 블록 범위이며 값이 지정되면 나중에 바꿀 수 없음. 또한, 재선언 될 수도 없음.

3) let 은 블록 범위이며 값이 지정되어도 값을 바꿀 수 있음.


*for문 안에서 비동기 함수 사용할때

~~~
<script>
	function foo(){
		for(var i = 0; i < 10; i++){
			setTimeout(function(){
			$( ".test" ).append( "<p>" + i + "</p>" );
			}, 500);
		}
	}
</script>
~~~
 
이렇게 바뀌는 것을 let을 통해 번거롭게 안해도됨
~~~
<script>
  function foo(){
		for(var i = 0; i < 10; i++){
			{(i)=>{
        setTimeout(function(){
        $( ".test" ).append( "<p>" + i + "</p>" );
        }, 500);
      })(i);
		}
	}
</script>
  ~~~
