
public abstract class Book implements Readable,Comparable{
	private int maxPages;
	private String name;
	//Constructors:
	public Book(int maxPages,String name){
		this.maxPages=maxPages;
		this.name=name;
	}
	//Getters:
	public int getMaxPages() {
		return maxPages;
	}
	public String getName() {
		return name;
	}
	//Methods:
	public String	toString(){
		return "name: "+name+" max of pages: "+maxPages;
	}
	
	public int compareTo(Object obj){
		Book b=(Book)(obj);
		return (this.name.compareTo(b.name));

	}
}


