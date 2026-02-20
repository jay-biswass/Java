package OOPs;

public class PrivateKeyword {
    public static class Students{
        String name;
        private int roll;
        double cgpa;
        private void print(){
            System.out.println(name+" "+roll+" "+cgpa);
        }

        int getRoll(){
            return roll;
        }

        void setRoll(int x){
            roll = x;
        }

//        public void p(){
//            print();
//        }
    }
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "JAY";
        s1.cgpa = 9.65;
        s1.print();
        s1.setRoll(45);
        System.out.println(s1.getRoll());
    }
}
