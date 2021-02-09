public class Main {
    public static void main(String[] args){
        IntegerDynamicArray teste = new IntegerDynamicArray();
        for(int i =0; i < 20; i++){
            teste.add(i);
        }
        System.out.println(teste);
            teste.remove(4);
            teste.remove(7);
            teste.remove(10);
        System.out.println(teste);
        try {
            System.out.println(teste.getAT(-1));
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(teste.size());
    }
}


