package webapp.web.boot.landRent.service.sql;

public interface LandRentSQL {

	public final String  save = "INSERT INTO land_rent "
			+ "(owner_id, renter_id, price_month, date, land_size) "
			+ "values (?,?,?,now(),?)";
}
