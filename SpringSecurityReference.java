/* 

Spring Security Reference

1. Authentication vs Authorization:
- Authentication: Verifying user credentials (e.g., username/password, LDAP, OAuth2 token).
- Authorization: Verifying if the authenticated user has access rights to specific API paths or methods (Roles/Authorities).

2. JWT (JSON Web Tokens):
- A stateless client-side session mechanism.
- The user authenticates once. The server signs a JSON payload containing permissions and claims.
- The client passes this JWT in the Authorization header (Bearer <token>) on subsequent requests.
- A custom Security filter parses and validates the token signature using a secret key.

3. OAuth2:
- An authorization framework allowing applications to obtain limited access to user accounts on an HTTP service (e.g., Google, GitHub).
- Grant Types: Authorization Code, Client Credentials, Refresh Token.

Syntax:
@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean SecurityFilterChain filterChain(HttpSecurity http) { ... }
}

*/

/*

Mockup of a JWT filter and Security Config layout:

*/

// --- Security Configuration (Spring Security 6.x style) ---
// @Configuration
// @EnableWebSecurity
class SecurityConfig {
    
    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //     return http
    //         .csrf(csrf -> csrf.disable()) // Disable CSRF for stateless APIs
    //         .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
    //         .authorizeHttpRequests(auth -> auth
    //             .requestMatchers("/api/auth/**").permitAll() // Open endpoints
    //             .anyRequest().authenticated()               // Secure other endpoints
    //         )
    //         .build();
    // }
}

class SpringSecurityReference {
    public static void main(String[] args) {
        System.out.println("Spring Security & JWT Overview:");
        System.out.println("---------------------------------");
        System.out.println("1. SecurityFilterChain: Chain of filters that intercept incoming requests.");
        System.out.println("2. JWT filter extract and authenticate tokens from authorization headers.");
        System.out.println("3. OAuth2 client modules delegate identity verification to third-party ID providers.");
    }
}
