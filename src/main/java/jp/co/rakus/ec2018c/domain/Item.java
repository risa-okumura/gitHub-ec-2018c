package jp.co.rakus.ec2018c.domain;

import java.util.List;

/**
 * 商品一覧を表示するドメイン.
 * @author momo.senda
 *
 */
public class Item {
	/**商品ID*/
	Integer id;
	
	/**商品名*/
	String name;
	
	/**商品説明*/
	String description;
	
	/**Mサイズの価格*/
	Integer priceM;
	
	/**Lサイズの価格*/
	Integer priceL;
	
	/**商品写真のパス*/
	String imagePath;
	
	/**削除フラグ*/
	Boolean deleted;
	
	/**トッピングのリスト*/
	List<Topping> toppingList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPriceM() {
		return priceM;
	}
	public void setPriceM(Integer priceM) {
		this.priceM = priceM;
	}
	public Integer getPriceL() {
		return priceL;
	}
	public void setPriceL(Integer priceL) {
		this.priceL = priceL;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public List<Topping> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Topping> toppingList) {
		this.toppingList = toppingList;
	}
}
