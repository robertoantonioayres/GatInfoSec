package br.com.robertoantonio.model;

import java.io.Serializable;

/**
 * @author Roberto Ayres
 * @since 19/11/2021
 * @version 1.0.0
 */
public abstract class AbstractEntity implements IdentifierPK<Long>, Serializable {

	private static final long serialVersionUID = 1L;
	
	public boolean isNew() {
		return getId() == null;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (getId() != null ? getId().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof AbstractEntity)) {
			return false;
		}
		AbstractEntity other = (AbstractEntity) object;
		if ((this.getId() == null && other.getId() != null)
				|| (this.getId() != null && !this.getId().equals(other.getId()))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + "[ ID=" + getId() + " ]";
	}

}
