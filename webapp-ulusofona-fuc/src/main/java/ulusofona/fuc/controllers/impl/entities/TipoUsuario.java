package ulusofona.fuc.controllers.impl.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "edit_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date editDate;

	@Column(name = "enum_status_id")
	private int enumStatusId;

	public TipoUsuario() {
	}

	public TipoUsuario(Long id, String tipo, Date createDate, Date editDate, int enumStatusId) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.createDate = createDate;
		this.editDate = editDate;
		this.enumStatusId = enumStatusId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public int getEnumStatusId() {
		return enumStatusId;
	}

	public void setEnumStatusId(int enumStatusId) {
		this.enumStatusId = enumStatusId;
	}

	@Override
	public String toString() {
		return "TipoUsuario [id=" + id + ", tipo=" + tipo + ", createDate=" + createDate + ", editDate=" + editDate
				+ ", enumStatusId=" + enumStatusId + "]";
	}
}
