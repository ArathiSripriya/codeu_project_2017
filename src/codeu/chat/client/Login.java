package codeu.chat.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


import java.util.ArrayList;
import java.util.Collection;

import codeu.chat.common.BasicView;
import codeu.chat.common.Conversation;
import codeu.chat.common.ConversationSummary;
import codeu.chat.common.LogicalView;
import codeu.chat.common.Message;
import codeu.chat.common.NetworkCode;
import codeu.chat.common.User;
import codeu.chat.util.Logger;
import codeu.chat.util.Serializers;
import codeu.chat.util.Time;
import codeu.chat.util.Uuid;
import codeu.chat.util.connections.Connection;
import codeu.chat.util.connections.ConnectionSource;
import codeu.chat.client.ClientUser;

public class Login {
    private static User user;
    private static ClientUser clientUser;
    
    public Login(ClientUser cu){
	this.clientUser = cu;
    }

    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
	user = clientUser.searchByName(username);

        if ((user != null) && (username.equals(user.name) && password.equals(user.password))) {
            return true;
        }
        return false;
    }
}
