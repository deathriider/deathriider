interface Interface1 {
        void method1();
        void method2();
       }
       interface Interface2 {
        void method3();
        void method4();
       }
       interface Interface3 {
        void method5();
        void method6();
       }
       interface NewInterface extends Interface1, Interface2, Interface3 {
        void method7();
       }
       class ConcreteClass {
        void commonMethod() {
            System.out.println("This is a common method.");
            }
           }
           class threeinterface extends ConcreteClass implements NewInterface {
            @Override
            public void method1() {System.out.println("Method1 from Interface1");}
            @Override
            public void method2() {System.out.println("Method2 from Interface1");}
            @Override
            public void method3() {System.out.println("Method3 from Interface2");}
            @Override
            public void method4() {System.out.println("Method4 from Interface2");}
            @Override
            public void method5() {System.out.println("Method5 from Interface3");}
            @Override
            public void method6() {System.out.println("Method6 from Interface3");}
            @Override
            public void method7() {System.out.println("Method7 from NewInterface");}
            public static void main(String[] args) {
            threeinterface  obj = new threeinterface();
            obj.method1();
            obj.method7();
            obj.commonMethod();
            }
           }

