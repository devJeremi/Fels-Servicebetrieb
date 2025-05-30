// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nanoflowcommons.proxies;

public enum Enum_DistanceUnit
{
	KILOMETER(new java.lang.String[][] { new java.lang.String[] { "en_US", "KILOMETER" } }),
	STATUTE_MILE(new java.lang.String[][] { new java.lang.String[] { "en_US", "STATUTE_MILE" } }),
	NAUTICAL_MILE(new java.lang.String[][] { new java.lang.String[] { "en_US", "NAUTICAL_MILE" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_DistanceUnit(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "de_DE");
	}

	public java.lang.String getCaption()
	{
		return captions.get("de_DE");
	}
}
