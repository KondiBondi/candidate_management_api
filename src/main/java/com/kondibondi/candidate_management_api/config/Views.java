package com.kondibondi.candidate_management_api.config;

public class Views {
    public interface Anonymous {}
    public interface User extends Anonymous {}
    public interface AdminUser extends User {}
    public interface SysAdmin extends AdminUser {}
    public interface Admin extends SysAdmin {}
}