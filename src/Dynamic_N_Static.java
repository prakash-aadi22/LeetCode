class other_class {
    void d_py() {
        System.out.println("Class_Dynamic");
    }

    static void s_py() {
        System.out.println("Class_Static");
    }
}

public class Dynamic_N_Static {
    void py_d() {
        System.out.println("Function_Dynamic");
    }

    static void py_s() {
        System.out.println("Function_Static");
    }

    public static void main(String[] args) {
        other_class p = new other_class();
        p.d_py();
        other_class.s_py();

        Dynamic_N_Static d = new Dynamic_N_Static();
        d.py_d();

        py_s();
        Dynamic_N_Static.py_s();
    }
}
