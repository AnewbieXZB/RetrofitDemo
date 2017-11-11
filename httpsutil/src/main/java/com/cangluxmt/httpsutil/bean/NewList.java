package com.cangluxmt.httpsutil.bean;

import java.util.List;

/**
 * Created by XIEZHENBO on 2017/11/10 0010 下午 16:13.
 */

public class NewList {
    @Override
    public String toString() {
        return "NewList{" +
                "config=" + config +
                ", news=" + news +
                '}';
    }

    private ConfigBean config;
        private List<?> news;

        public ConfigBean getConfig() {
            return config;
        }

        public void setConfig(ConfigBean config) {
            this.config = config;
        }

        public List<?> getNews() {
            return news;
        }

        public void setNews(List<?> news) {
            this.news = news;
        }

        public static class ConfigBean {
            /**
             * id : 121
             * code : null
             * salt : null
             * agentId : 12
             * type : 3
             * serviceIp : null
             * servicePath : null
             * imageIp : null
             * imagePath : null
             * logo_url : null
             * weixinpic_url : null
             * agent_name : 11111
             * loginpic_url : null
             * contact_url : null
             * web_record : null
             * mapping_ip : wechat.cangluxmt.com
             * location_ip : 39.108.79.133
             * resource_url : https://test.wechat.cangluxmt.com/wechat/
             * static_url : https://test.wechat.cangluxmt.com/wechat/resources/h5
             * h5_url : null
             * image_resource : http://test.image.cangluxmt.com/jcshopimage/
             * cookie_domain : .jcshop.12
             * cookie_name : jcshop_12
             * solr_url : http://test.image.cangluxmt.com/solr
             * solr_server : jcshopcore
             * codeMap : null
             */

            private int id;
            private Object code;
            private Object salt;
            private int agentId;
            private int type;
            private Object serviceIp;

            @Override
            public String toString() {
                return "ConfigBean{" +
                        "id=" + id +
                        ", code=" + code +
                        ", salt=" + salt +
                        ", agentId=" + agentId +
                        ", type=" + type +
                        ", serviceIp=" + serviceIp +
                        ", servicePath=" + servicePath +
                        ", imageIp=" + imageIp +
                        ", imagePath=" + imagePath +
                        ", logo_url=" + logo_url +
                        ", weixinpic_url=" + weixinpic_url +
                        ", agent_name='" + agent_name + '\'' +
                        ", loginpic_url=" + loginpic_url +
                        ", contact_url=" + contact_url +
                        ", web_record=" + web_record +
                        ", mapping_ip='" + mapping_ip + '\'' +
                        ", location_ip='" + location_ip + '\'' +
                        ", resource_url='" + resource_url + '\'' +
                        ", static_url='" + static_url + '\'' +
                        ", h5_url=" + h5_url +
                        ", image_resource='" + image_resource + '\'' +
                        ", cookie_domain='" + cookie_domain + '\'' +
                        ", cookie_name='" + cookie_name + '\'' +
                        ", solr_url='" + solr_url + '\'' +
                        ", solr_server='" + solr_server + '\'' +
                        ", codeMap=" + codeMap +
                        '}';
            }

            private Object servicePath;
            private Object imageIp;
            private Object imagePath;
            private Object logo_url;
            private Object weixinpic_url;
            private String agent_name;
            private Object loginpic_url;
            private Object contact_url;
            private Object web_record;
            private String mapping_ip;
            private String location_ip;
            private String resource_url;
            private String static_url;
            private Object h5_url;
            private String image_resource;
            private String cookie_domain;
            private String cookie_name;
            private String solr_url;
            private String solr_server;
            private Object codeMap;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getCode() {
                return code;
            }

            public void setCode(Object code) {
                this.code = code;
            }

            public Object getSalt() {
                return salt;
            }

            public void setSalt(Object salt) {
                this.salt = salt;
            }

            public int getAgentId() {
                return agentId;
            }

            public void setAgentId(int agentId) {
                this.agentId = agentId;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public Object getServiceIp() {
                return serviceIp;
            }

            public void setServiceIp(Object serviceIp) {
                this.serviceIp = serviceIp;
            }

            public Object getServicePath() {
                return servicePath;
            }

            public void setServicePath(Object servicePath) {
                this.servicePath = servicePath;
            }

            public Object getImageIp() {
                return imageIp;
            }

            public void setImageIp(Object imageIp) {
                this.imageIp = imageIp;
            }

            public Object getImagePath() {
                return imagePath;
            }

            public void setImagePath(Object imagePath) {
                this.imagePath = imagePath;
            }

            public Object getLogo_url() {
                return logo_url;
            }

            public void setLogo_url(Object logo_url) {
                this.logo_url = logo_url;
            }

            public Object getWeixinpic_url() {
                return weixinpic_url;
            }

            public void setWeixinpic_url(Object weixinpic_url) {
                this.weixinpic_url = weixinpic_url;
            }

            public String getAgent_name() {
                return agent_name;
            }

            public void setAgent_name(String agent_name) {
                this.agent_name = agent_name;
            }

            public Object getLoginpic_url() {
                return loginpic_url;
            }

            public void setLoginpic_url(Object loginpic_url) {
                this.loginpic_url = loginpic_url;
            }

            public Object getContact_url() {
                return contact_url;
            }

            public void setContact_url(Object contact_url) {
                this.contact_url = contact_url;
            }

            public Object getWeb_record() {
                return web_record;
            }

            public void setWeb_record(Object web_record) {
                this.web_record = web_record;
            }

            public String getMapping_ip() {
                return mapping_ip;
            }

            public void setMapping_ip(String mapping_ip) {
                this.mapping_ip = mapping_ip;
            }

            public String getLocation_ip() {
                return location_ip;
            }

            public void setLocation_ip(String location_ip) {
                this.location_ip = location_ip;
            }

            public String getResource_url() {
                return resource_url;
            }

            public void setResource_url(String resource_url) {
                this.resource_url = resource_url;
            }

            public String getStatic_url() {
                return static_url;
            }

            public void setStatic_url(String static_url) {
                this.static_url = static_url;
            }

            public Object getH5_url() {
                return h5_url;
            }

            public void setH5_url(Object h5_url) {
                this.h5_url = h5_url;
            }

            public String getImage_resource() {
                return image_resource;
            }

            public void setImage_resource(String image_resource) {
                this.image_resource = image_resource;
            }

            public String getCookie_domain() {
                return cookie_domain;
            }

            public void setCookie_domain(String cookie_domain) {
                this.cookie_domain = cookie_domain;
            }

            public String getCookie_name() {
                return cookie_name;
            }

            public void setCookie_name(String cookie_name) {
                this.cookie_name = cookie_name;
            }

            public String getSolr_url() {
                return solr_url;
            }

            public void setSolr_url(String solr_url) {
                this.solr_url = solr_url;
            }

            public String getSolr_server() {
                return solr_server;
            }

            public void setSolr_server(String solr_server) {
                this.solr_server = solr_server;
            }

            public Object getCodeMap() {
                return codeMap;
            }

            public void setCodeMap(Object codeMap) {
                this.codeMap = codeMap;
            }
        }

}
