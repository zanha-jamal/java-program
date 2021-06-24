import java.util.*;

class publisher {
    String name;
    String location;
    String ISBN_number;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of publisher:");
        name = sc.nextLine();
        System.out.println("Enter the location:");
        location = sc.nextLine();
        System.out.println("Enter the ISBN number:");
        ISBN_number = sc.nextLine();
    }
}

class book extends publisher {
    String author;
    String title;
    int price;
    String category;

    void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter author name:");
        author = sc.nextLine();
        System.out.println("Enter book title:");
        title = sc.nextLine();
        System.out.println("Enter category of book:");
        category = sc.nextLine();
        System.out.println("Enter price of book:");
        price = sc.nextInt();
    }

    void show() {
        System.out.println("The book title is : " + title);
        System.out.println("The book author is :" + author);
        System.out.println("The gategory of the book :" + category);
        System.out.println("The bublisher of the book is:" + name);
        System.out.println("The publisher location is :" + location);
        System.out.println("The publisher ISBN number is:" + ISBN_number);
    }
}

class Q12_Publisher {
    public static void main(String args[]) {
        System.out.println("\nEnter Details:");
        System.out.println("--------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of books:");
        int count = sc.nextInt();
        book b[] = new book[count];
        for (int i = 0; i < count; i++) {
            b[i] = new book();
            b[i].read();
        }
        Scanner st = new Scanner(System.in);
        System.out.println("\nChoose Category:");
        String ct = st.nextLine();
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if (ct.equals(b[i].category)) {
                System.out.println(ct + " category book  details:");
                b[i].show();
                flag = true;
            } else {
                continue;
            }
        }
        if (!flag)
            System.out.println("This category of book is not available:");
    }
}