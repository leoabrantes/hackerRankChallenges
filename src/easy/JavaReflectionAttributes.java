package easy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Studenttt{

	    public void ahqym() { System.out.println("ahqym"); }
	    public void amftc() { System.out.println("amftc"); }
	    public void anotherfunction() { System.out.println("anotherfunction"); }
	    public void atcks() { System.out.println("atcks"); }
	    public void bwkbd() { System.out.println("bwkbd"); }
	    public void cfwyc() { System.out.println("cfwyc"); }
	    public void cmkxa() { System.out.println("cmkxa"); }
	    public void dnpym() { System.out.println("dnpym"); }
	    public void dnqvo() { System.out.println("dnqvo"); }
	    public void dvvwq() { System.out.println("dvvwq"); }
	    public void ehjdm() { System.out.println("ehjdm"); }
	    public void elyed() { System.out.println("elyed"); }
	    public void fmyce() { System.out.println("fmyce"); }
	    public void getEmail() { System.out.println("getEmail"); }
	    public void getId() { System.out.println("getId"); }
	    public void getName() { System.out.println("getName"); }
	    public void ghtlj() { System.out.println("ghtlj"); }
	    public void hluvb() { System.out.println("hluvb"); }
	    public void isqdf() { System.out.println("isqdf"); }
	    public void iwhtf() { System.out.println("iwhtf"); }
	    public void jmopy() { System.out.println("jmopy"); }
	    public void jnskt() { System.out.println("jnskt"); }
	    public void kbjlt() { System.out.println("kbjlt"); }
	    public void kgwku() { System.out.println("kgwku"); }
	    public void khuag() { System.out.println("khuag"); }
	    public void levtp() { System.out.println("levtp"); }
	    public void mcgme() { System.out.println("mcgme"); }
	    public void migyc() { System.out.println("migyc"); }
	    public void moebl() { System.out.println("moebl"); }
	    public void nixhb() { System.out.println("nixhb"); }
	    public void odyqp() { System.out.println("odyqp"); }
	    public void ogvdl() { System.out.println("ogvdl"); }
	    public void ormim() { System.out.println("ormim"); }
	    public void piwro() { System.out.println("piwro"); }
	    public void plaob() { System.out.println("plaob"); }
	    public void pnruo() { System.out.println("pnruo"); }
	    public void pqfct() { System.out.println("pqfct"); }
	    public void ptrup() { System.out.println("ptrup"); }
	    public void pvgyp() { System.out.println("pvgyp"); }
	    public void qthde() { System.out.println("qthde"); }
	    public void rmjig() { System.out.println("rmjig"); }
	    public void setEmail() { System.out.println("setEmail"); }
	    public void setId() { System.out.println("setId"); }
	    public void setName() { System.out.println("setName"); }
	    public void sumvl() { System.out.println("sumvl"); }
	    public void tkbpp() { System.out.println("tkbpp"); }
	    public void tntpj() { System.out.println("tntpj"); }
	    public void toxdp() { System.out.println("toxdp"); }
	    public void twyfa() { System.out.println("twyfa"); }
	    public void uccfq() { System.out.println("uccfq"); }
	    public void ujxei() { System.out.println("ujxei"); }
	    public void vhxoi() { System.out.println("vhxoi"); }
	    public void viwuu() { System.out.println("viwuu"); }
	    public void viyog() { System.out.println("viyog"); }
	    public void whjtj() { System.out.println("whjtj"); }
	    public void ytijy() { System.out.println("ytijy"); }
}

public class JavaReflectionAttributes {

    public static void main(String[] args){
        Class<Studenttt> student = Studenttt.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i<methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
