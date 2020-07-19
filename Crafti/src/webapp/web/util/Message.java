package webapp.web.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import webapp.web.boot.item.bid.model.Bid;
import webapp.web.boot.item.model.Items;

@Component
public class Message<E> {

	private String title;
	private String content;
	private String imagePath;
	private String errorMessage;
	private String name;
	private int id;
	private int code;
	private List<E> list;
	private E object;
	private Items item;
	private Bid bid;
	private List<Items> items;
	
	
	public Message(String title, String content, int code) {
		super();
		this.title = title;
		this.content = content;
		this.code = code;
	}
	public Message(String title, String content, String imagePath, String errorMessage, int code,List<E>list) {
		super();
		this.title = title;
		this.content = content;
		this.imagePath = imagePath;
		this.errorMessage = errorMessage;
		this.code = code;
		this.setList(list);
	}
	public Message(){}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public E getObject() {
		return object;
	}
	public void setObject(E object) {
		this.object = object;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	
	public Bid getBid() {
		return bid;
	}
	public void setBid(Bid bid) {
		this.bid = bid;
	}
	
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> bids) {
		this.items = bids;
	}
	public Message(String title, String content, int code, E object) {
		super();
		this.title = title;
		this.content = content;
		this.code = code;
		this.object = object;
	}	
	
	public static Message setBasic(HttpServletRequest request, Message message){
		int id = (int)request.getSession().getAttribute("userId");
		String name = (String)request.getSession().getAttribute("userName");
		message.setName(name);
		message.setId(id);
		return message;
		
	}
	
}

