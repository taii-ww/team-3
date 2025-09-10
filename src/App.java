public class App {
    public static void main(String[] args) {
       
        String name = "Tài";       
        int age = 19;               
        double height = 1.70;       
        char likeCoding = '?';      
        boolean isCodingLover = false; 

       
        System.out.println("Thông tin cá nhân:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + "m");
        System.out.println("Có thích lập trình không: " + (isCodingLover ? "Có" : "Bình thường"));
        
    }
}