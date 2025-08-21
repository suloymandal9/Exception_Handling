public class Super {
    class a {
        void aaaa(){
            System.out.println("aaaa");
        }
        a(){
            System.out.println("a is running");
        }
    }

    class b extends a {
        void aaaa(){
            System.out.println("bbbb");
        }
        b(){
            super();
            System.out.println("b is running");
        }
        void work(){
            super.aaaa();
        }
    }
}
