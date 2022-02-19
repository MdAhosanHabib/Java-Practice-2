package chapter4;

public class Height {
    public void heightget(int age,int heig) {
        double recommendedWeight = (heig - 100 + age / 10) * 0.90;
        System.out.println("Recommended weight(KG(sad) "+recommendedWeight+" KG");
    }
}
