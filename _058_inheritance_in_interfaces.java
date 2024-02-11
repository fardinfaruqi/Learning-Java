public class _058_inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

interface SampleInterface {
    void meth1();

    void meth2();
}

// interfaces can only be extended in interfaces, not in classes
interface ChildSampleInterface extends SampleInterface {
    void meth3();

    void meth4();
}

class MySampleClass implements ChildSampleInterface {
    public void meth1() {
        System.out.println("method 1 from SampleInterface");
    };

    public void meth2() {
        System.out.println("method 2 from SampleInterface");
    }

    public void meth3() {
        System.out.println("method 3 from ChildSampleInterface");
    }

    public void meth4() {
        System.out.println("method 4 from ChildSampleInterface");
    }
}