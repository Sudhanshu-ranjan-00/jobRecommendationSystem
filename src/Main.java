import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your Qualification");
    System.out.println("1. 10th Pass\n2. 12th Pass\n3. Graduate\n");
    int qual  = sc.nextInt();
    int interest;


        switch (qual) {
            case 1 -> {
                /*


                If the user is 10th passed!

                 */
                System.out.println("Enter your interest : ");
                System.out.println("1. Govt based jobs\n2. Private jobs\n");
                interest = sc.nextInt();
                if (interest == 1) {
                    /*

                    If the user is 10th passed and wants govt job!

                     */
                    System.out.println("Jobs recommended for you : ");
                    System.out.println("1. Bank peon\n2. Postman\n3. CRPF Constable\n4. Driver(RBI)\n5. ITBP Constable\n6. Anganbadi workder");
                    System.out.println("7. Home Guard-Jharkhand home defence\nFor more jobs you can visit us at www.jobrecommendator.com!\n------------------------Thank you!------------------------");
                } else if (interest == 2) {
                    /*

                    If the user is 10th passed and wants private job!

                     */
                    System.out.println("Jobs recommended for you : ");
                    System.out.println("1. Travelling ticket executive\n2. Customer care executive\n3. Receptionist\n4. Delivery person\n5. Data entry operator");
                    System.out.println("6. SalesPerson\n7. Social media handler\nFor more jobs you can visit us at www.jobrecommendator.com!\n------------------------Thank you!------------------------");
                }
                else
                {
                    System.out.println("Interest out of bound!");
                }
            }
            case 2 -> {
                /*

                    If the user is 12th passed!

                     */
                System.out.println("Enter your interest : ");
                System.out.println("1. Govt based jobs\n2. Private jobs\n");
                interest = sc.nextInt();
                if (interest == 1) {
                    /*

                    If the user is 12th passed and wants govt job

                     */
                    System.out.println("Choose your area of interest : ");
                    System.out.println("1. Defence forces\n2. Railway\n3. Administrative");
                    int areaOfInterest = sc.nextInt();
                    if (areaOfInterest == 1) {
                        /*

                    If the user is 12th passed and wants govt job in Defence forces!

                     */
                        System.out.println("""
                                1. Border Security Force (BSF)
                                2. Central Reserve Police Force (CRPF)
                                3. Sashastra Seema Bal (SSB)
                                4. Indo-Tibetan Border Police Force (ITBP)
                                5. Central Industrial Security Force (CISF)
                                6. Indian Air force(I.A.F.)
                                7. Indian navy
                                For more jobs you can visit us at www.jobrecommendator.com!
                                ------------------------Thank you!------------------------""");
                    } else if (areaOfInterest==2) {
                        /*

                    If the user is 12th passed and wants govt job in Railways!

                     */
                        System.out.println("1. Railway group D.\n2. Assistant loco pilot\n3. Railway clerk\n4. Railway constable\nFor more jobs you can visit us at www.jobrecommendator.com!\n------------------------Thank you!------------------------");
                    }
                    else if(areaOfInterest==3)
                    {
                        /*

                    If the user is 12th passed and wants govt job in administrations!

                     */
                        System.out.println("""
                                1. SSC Combined Higher Secondary Level (SSC CHSL)
                                2. Upper Division Clerk (UDC)
                                3. Lower Division Clerk (LDC)
                                4. Postal Assistant (PA)
                                5. Data Entry Operator (DEO)
                                6. Sorting Assistant (SA)
                                7. SSC Multi Tasking Staff (SSC MTS)
                                8. SSC General Duty Constable (SSC GD Exam)
                                9. SSC Grade C and Grade D Stenographer (SSC Stenographer)
                                10. Other than these you may also appear for most prestigious posts :\s
                                \t10 (a) : Indian Administrative Service(I.A.S.)
                                \t10 (b) : Indian Police Service(I.P.S.)
                                 \t10 (c) : Indian Forest Service(I.F.S.)
                                \tMany other posts are there. For more info google UPSC Exam!
                                For more jobs you can visit us at www.jobrecommendator.com!
                                ------------------------Thank you!------------------------""");
                    }
                    else {
                        System.out.println("Area of interest out of bound!");
                    }
                } else if (interest==2) {
                    /*

                    If the user is 12th passed and wants private job

                     */
                    System.out.println("""
                            1. Computer operator
                            2. Tele Sales Executive
                            3. Receptionist
                            4. Data-Entry Operators
                            5. Content Writer
                            6. Home tutor
                            7. Merchant Navy
                            8. Event manager
                            9. Social media manager
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------""");

                }
            }
            case 3 -> {
                /*

                    If the user is Graduate!

                     */
                    System.out.println("Please select your field of study : ");
                    System.out.println("""
                            1. Business administrations
                            2. Computer science engineering
                            3. Arts
                            4. Commerce
                            5. Law
                            6. Chemistry
                            7. Medical
                            """);
                    int fieldOfStudy=sc.nextInt();
                switch (fieldOfStudy) {
                    case 1 -> System.out.println("""
                            Jobs for Business graduates =>
                            1. Branch manager of any bank, company, industry or school/colleges etc.
                            2. Human resource
                            3. Retail manager
                            4. Operations manager
                            5. Event manager
                            6. Project manager
                            7. Airlines manager
                            8. Sales executive
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------""");
                    case 2 -> {
                        System.out.println("Select your skills : ");
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("""
                                Jobs for Computer science graduates having skills =>
                                1. Python, R language, SKlearn, Anaconda, Pytorch, Tensorflow
                                2. Amazon web services, Google cloud & microsoft azure,Github, Kubernets, Informatica
                                3. Python, R language, Apache spark, Apache hadoop and Microsoft excel
                                4. NodeJS, PHP, Python, Laravel, Linux
                                5. HTML, CSS, JavaScript, Bootstrap and ReactJS
                                6. Kali linux, Metasploit, Wireshark
                                7. Databases : SQL, NoSQL, PostGreSQL, mongoDB
                                8. No. 4th, 5th and 7th
                                9. Snowflake,Amazon Redshift, Python, SQL, tableau
                                10. Git, Github, GitLAb, Docker, Kubernetes, Maven, AWS, Google cloud
                                11. Java, c, c++, databases, data structures and algorithms
                                  """);
                        int skills = sc1.nextInt();
                        switch (skills) {
                            case 1 -> System.out.println("You can become a machine learning engineer!");
                            case 2 -> System.out.println("You can become a cloud computing engineer!");
                            case 3 -> System.out.println("You can become a data analyst!");
                            case 4 -> System.out.println("You can become a backend developer!");
                            case 5 -> System.out.println("You can become a front end developer!");
                            case 6 -> System.out.println("You can become a cyber security specialist!");
                            case 7 -> System.out.println("You can become a database engineer!");
                            case 8 -> System.out.println("You can become a full stack developer!");
                            case 9 -> System.out.println("You can become a data engineer!");
                            case 10 -> System.out.println("You can become a devops engineer!");
                            case 11 -> System.out.println("You can become a software engineer!");
                            default ->
                                    System.out.println("For more jobs you can visit us at www.jobrecommendator.com!\n" +
                                            "------------------------Thank you!------------------------");
                        }
                    }
                    case 3 -> System.out.println("""
                            Jobs for Arts graduates =>
                            1. Fashion Designer
                            2. Law professional for llb graduates
                            3. Illustrator
                            4. Graphic Designer
                            5. Photography
                            6. Actor, theater, dancer, music creation
                            7. Civil services
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------
                            """);
                    case 4 -> System.out.println("""
                            Jobs for Commerce graduates =>
                            1. Chartered accountant
                            2. Marketing manager
                            3. Investment banker
                            4. Human resource manager
                            5. Cost accountant
                            6. Retail manager
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------
                            """);
                    case 5 -> System.out.println("""
                            Jobs for law graduates =>
                            1. Corporate lawyer
                            2. Judicial services
                            3. Legal journalist
                            4. Civil lawyer
                            5. Legal advisor
                            6. Criminal lawyer
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------
                            """);
                    case 6 -> System.out.println("""
                            Jobs for chemistry graduates =>
                            1. Academic researcher
                            2. Analytical chemist
                            3. Biotechnologist
                            4. Chemical scientist
                            5. Crime scene investigator
                            6. Forensic investigator
                            7. Medicinal chemist
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------
                            """);
                    case 7 -> System.out.println("""
                            Jobs for Medical graduates =>
                            1. Cardiologist
                            2. Hospital doctor
                            3. Neurologist
                            4. General physician
                            5. Government jobs in health services department
                            6. Health administrations
                            7. Hospital management
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------
                            """);
                    default -> System.out.println("""
                            For more jobs you can visit us at www.jobrecommendator.com!
                            ------------------------Thank you!------------------------
                            """);
                }

            }
            default ->
                System.out.println("""
                        
                        
                        
                        
                        Please select valid input!
                        -----Happy job search!-----
                        
                        
                        
                        
                        For more jobs you can visit us at www.jobrecommendator.com!
                        ------------------------Thank you!------------------------
                        """);


        }

    }
}
