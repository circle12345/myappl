package com.example.leeco.myapplication.jsons;

import java.util.List;

/**
 * Created by leeco on 16/8/5.
 */
public class Users {

    /**
     * id : 02
     * name : tom
     * gender : 男
     */

    private List<MessagesBean> messages;

    public List<MessagesBean> getMessages() {
        return messages;
    }

    public void setMessages(List<MessagesBean> messages) {
        this.messages = messages;
    }

    public static class MessagesBean {
        private String id;
        private String name;
        private String gender;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
}
