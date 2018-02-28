package com.greenfoxacademy.websecurity2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CompositeFilter;

import javax.servlet.Filter;
import java.security.Principal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
//@EnableOAuth2Client
@EnableOAuth2Sso
//@RestController
//@EnableAuthorizationServer
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@Controller
public class Websecurity2Application extends WebSecurityConfigurerAdapter{

//  @Qualifier("oauth2ClientContext")
//  @Autowired
//  OAuth2ClientContext oauth2ClientContext;
//
//  @RequestMapping({ "/user", "/me" })
//  public Map<String, String> user(Principal principal) {
//    Map<String, String> map = new LinkedHashMap<>();
//    map.put("name", principal.getName());
//    return map;
//  }
//
//  @RequestMapping("/unauthenticated")
//  public String unauthenticated() {
//    return "redirect:/?error=true";
//  }
//
  public static void main(String[] args) {
      SpringApplication.run(Websecurity2Application.class, args);
  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//            .antMatcher("/**")
//            .authorizeRequests()
//              .antMatchers("/", "/login**", "/webjars/**")
//              .permitAll()
//            .anyRequest()
//              .authenticated()
//            .and().exceptionHandling()
//              .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/"))
//            .and().logout().logoutSuccessUrl("/").permitAll()
//            .and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//            .and().addFilterBefore(ssoFilter(), BasicAuthenticationFilter.class);
//  }
//
//  private Filter ssoFilter() {
//
//    CompositeFilter filter = new CompositeFilter();
//    List<Filter> filters = new ArrayList<>();
//    filters.add(ssoFilter(google(), "/login/google"));
//    filters.add(ssoFilter(github(), "/login/github"));
//    filter.setFilters(filters);
//    return filter;
//  }
//
//  private Filter ssoFilter(ClientResources client, String path) {
//    OAuth2ClientAuthenticationProcessingFilter filter = new OAuth2ClientAuthenticationProcessingFilter(path);
//    OAuth2RestTemplate template = new OAuth2RestTemplate(client.getClient(), oauth2ClientContext);
//    filter.setRestTemplate(template);
//    UserInfoTokenServices tokenServices = new UserInfoTokenServices(
//            client.getResource().getUserInfoUri(), client.getClient().getClientId());
//    tokenServices.setRestTemplate(template);
//    filter.setTokenServices(tokenServices);
//    return filter;
//  }
//
//  class ClientResources {
//
//    @NestedConfigurationProperty
//    private AuthorizationCodeResourceDetails client = new AuthorizationCodeResourceDetails();
//
//    @NestedConfigurationProperty
//    private ResourceServerProperties resource = new ResourceServerProperties();
//
//    public AuthorizationCodeResourceDetails getClient() {
//      return client;
//    }
//
//    public ResourceServerProperties getResource() {
//      return resource;
//    }
//  }
//
//  @Configuration
//  @EnableResourceServer
//  protected static class ResourceServerConfiguration
//          extends ResourceServerConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//      http
//              .antMatcher("/me")
//              .authorizeRequests().anyRequest().authenticated();
//    }
//  }
//
//  @Bean
//  @ConfigurationProperties("github")
//  public ClientResources github() {
//    return new ClientResources();
//  }
//
//  @Bean
//  @ConfigurationProperties("google")
//  public ClientResources google() {
//    return new ClientResources();
//  }
//
//  @Bean
//  public FilterRegistrationBean oauth2ClientFilterRegistration(
//          OAuth2ClientContextFilter filter) {
//    FilterRegistrationBean registration = new FilterRegistrationBean();
//    registration.setFilter(filter);
//    registration.setOrder(-100);
//    return registration;
//  }
//
//  @Configuration
//  public class ServletCustomizer {
//    @Bean
//    public EmbeddedServletContainerCustomizer customizer() {
//      return container -> {
//        container.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED, "/unauthenticated"));
//      };
//    }
//  }
//
//  @Bean
//  public AuthoritiesExtractor authoritiesExtractor(OAuth2RestOperations template) {
//    return map -> {
//      String url = (String) map.get("organizations_url");
//      @SuppressWarnings("unchecked")
//      List<Map<String, Object>> orgs = template.getForObject(url, List.class);
//      if (orgs.stream()
//              .anyMatch(org -> "spring-projects".equals(org.get("login")))) {
//        return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
//      }
//      throw new BadCredentialsException("Not in Spring Projects origanization");
//    };
//  }
//
//  @Bean
//  public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
//    return new OAuth2RestTemplate(resource, context);
//  }

  @Bean
  public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
    return new OAuth2RestTemplate(resource, context);
  }

  @Bean
  public AuthoritiesExtractor authoritiesExtractor(OAuth2RestOperations template) {
    return map -> {
      String url = (String) map.get("organizations_url");
      @SuppressWarnings("unchecked")
      List<Map<String, Object>> orgs = template.getForObject(url, List.class);
      if (orgs.stream().anyMatch(org -> "greenfox-academy".equals(org.get("login")))) {
        return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
      }
      throw new BadCredentialsException("Not in Spring Team");
    };
  }

  @RequestMapping("/user")
  @ResponseBody
  public Principal user(Principal principal) {
    return principal;
  }

  @RequestMapping("/unauthenticated")
  public String unauthenticated() {
    return "redirect:/?error=true";
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    // @formatter:off
    http
            .antMatcher("/**").authorizeRequests()
            .antMatchers("/", "/login**", "/webjars/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .logout().logoutSuccessUrl("/").permitAll()
            .and()
            .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    // @formatter:on
  }

  @Configuration
  protected static class ServletCustomizer {
    @Bean
    public EmbeddedServletContainerCustomizer customizer() {
      return container -> {
        container.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED, "/unauthenticated"));
      };
    }
  }
}
