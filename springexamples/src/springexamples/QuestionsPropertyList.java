package springexamples;

import java.util.Iterator;
import java.util.List;

public class QuestionsPropertyList {
	private String id;
	private String name;
	private List<String> answers;
	public QuestionsPropertyList()
	{
	
	}
	public QuestionsPropertyList(String id,String name,List answers)
	{
		super();
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void Display()
	{
	System.out.println(name+" "+id);
	Iterator itr=answers.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}

