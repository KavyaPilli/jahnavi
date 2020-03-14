package springexamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class QuestionPropertyMap {
	private String id;
	private String name;
	private Map<String,String> answers;
	public QuestionPropertyMap()
	{
	
	}
	public QuestionPropertyMap(String id,String name,Map<String,String> answers)
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
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	public void Display()
	{
		System.out.println(name+" "+id);
		System.out.println("answers are :");
		Set keys=answers.entrySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}