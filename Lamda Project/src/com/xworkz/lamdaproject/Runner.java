package com.xworkz.lamdaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Gym");
		list.add("Supplement");
		list.add("Creatine");
		list.add("Protien");
		list.add("Dainabol");
		list.add("Trenboline");
		list.add("Testosterone Cypoinate");
		list.add("Anavar");
		list.add("Clenbatrol");
		list.add("Winstrol");
		list.add("Deca Durabol");
		list.add("Sustanon");
		list.add("Testosterone Propionate");
		list.add("Metenolone");
		list.add("Enanthate");
		list.add("Methylstenbolone");
		list.add("Androgen");
		list.add("oestrogens");
		list.add("Progestogens");
		list.add("Glucocorticoids");
		list.add("Synthol");
		
		
		//list.forEach((n)->{System.out.println(n);});
		
		
	List<String> strea =  list.stream().filter(x ->x.contains("i")).collect(Collectors.toList());
	
	//strea.forEach((u)->{System.out.println(u);});
	
	List<String> tren = list.stream().filter(n->!n.contains(" ")).collect(Collectors.toList());
	
	//tren.forEach((l)->{System.out.println(l);});
	

	List<String> dia = list.stream().sorted().collect(Collectors.toList());
	
	//dia.forEach((D)->{System.out.println(D);});
	
	List<String> dec = list.stream().map(v->v.toLowerCase()).collect(Collectors.toList());
	
	//dec.forEach((k)->{System.out.println(k);});
		
	List<String> dura = list.stream().filter(c->c.startsWith("A")||c.startsWith("C")||c.startsWith("D")||c.startsWith("E")||c.startsWith("G")||c.startsWith("M")
			||c.startsWith("P")||c.startsWith("S")||c.startsWith("T")||c.startsWith("W")).collect(Collectors.toList());
	
	//dura.forEach((r)->{System.out.println(r);});
	
	
	List<String> fuc = list.stream().filter(c->c.endsWith("e")).collect(Collectors.toList());
	//fuc.forEach((f)->{System.out.println(f);});
	
	List<String> sus = list.stream().filter(z->z.length()>8).collect(Collectors.toList());
	//sus.forEach((g)->{System.out.println(g);});
	
	//List<String> Ana = list.stream().filter(t->t.concat("Beast")).collect(Collectors.toList());
	
	//List<String> test = list.stream().filter(Q->Q.trim()).collect(Collectors.toList());
	
	
	
	List<String> ref = list.stream().filter(k->k.contains("s")).collect(Collectors.toList());
	//ref.forEach((g)->{System.out.println(g);});
	
	
	List<String> gef = list.stream().sorted().collect(Collectors.toList());
	//gef.forEach((r)->{System.out.println(r);});
	
	
	List<String> kgf = list.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
	//kgf.forEach((s)->{System.out.println(s);});
	
	List<String> gtr = list.stream().filter(n->n.contains("A")).collect(Collectors.toList());
	//gtr.forEach((d)->{System.out.println(d);});
	
	List<String> ntr = list.stream().sorted().collect(Collectors.toList());
	//ntr.forEach((g)->{System.out.println(g);});
	
	List<String> htr = list.stream().map(m->m.toLowerCase()).collect(Collectors.toList());
	htr.forEach((l)->{System.out.println(l);});
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
