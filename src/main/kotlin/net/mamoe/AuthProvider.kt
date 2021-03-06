package net.mamoe


data class AccessToken(
        val type:String = "bearer",
        val token:String
)

interface AuthProvider{
    /**
     * you should include cache in your build
     * this method will be called every time a request is sending to OneDrive
     *
     *
     * Refer to OneDrive API on how to get a access token
     */
    suspend fun getAccessToken():AccessToken

    /**
     * Api Base Url
     *
     * It differs in different type of accounts,
     * commonly it should be the default value
     * but certain business account may have different index
     */
    suspend fun getBaseUrl():String = "https://graph.microsoft.com/v1.0"
}

