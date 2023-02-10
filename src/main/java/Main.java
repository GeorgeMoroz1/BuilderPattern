public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Даздраперма")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Нью-Васюки")
                .build();
        mom.happyBirthday();
        Person son = mom.newChildBuilder()
                .setName("Сигизмунд")
                .setAge(10)
                .build();
        son.happyBirthday();
        System.out.println("У " + mom + " есть сын, " + son);

//        try {
//            // Не хватает обязательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }
}
