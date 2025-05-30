// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fels.proxies;

public class RefreshHelper implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject refreshHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Fels.RefreshHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Eintrag("Eintrag");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public RefreshHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected RefreshHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject refreshHelperMendixObject)
	{
		if (refreshHelperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, refreshHelperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.refreshHelperMendixObject = refreshHelperMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static fels.proxies.RefreshHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fels.proxies.RefreshHelper(context, mendixObject);
	}

	public static fels.proxies.RefreshHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fels.proxies.RefreshHelper.initialize(context, mendixObject);
	}

	/**
	 * @return value of Eintrag
	 */
	public final java.math.BigDecimal getEintrag()
	{
		return getEintrag(getContext());
	}

	/**
	 * @param context
	 * @return value of Eintrag
	 */
	public final java.math.BigDecimal getEintrag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Eintrag.toString());
	}

	/**
	 * Set value of Eintrag
	 * @param eintrag
	 */
	public final void setEintrag(java.math.BigDecimal eintrag)
	{
		setEintrag(getContext(), eintrag);
	}

	/**
	 * Set value of Eintrag
	 * @param context
	 * @param eintrag
	 */
	public final void setEintrag(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal eintrag)
	{
		getMendixObject().setValue(context, MemberNames.Eintrag.toString(), eintrag);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return refreshHelperMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final fels.proxies.RefreshHelper that = (fels.proxies.RefreshHelper) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
