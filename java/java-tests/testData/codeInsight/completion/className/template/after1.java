import pack.Foo;
class Test {
  {
    m(new Foo<String>() {
        @Override
        public void foo(String s) {
            
        }
    })
  }
  <T> void m(Foo<T> foo){}
}