
  Feature: Admin should create user, search for user, delete a user and verify no record found for deleted user.

   @Smoke @Regression
    Scenario: Admin should add user successfully
      Given Admin is on homepage
      When User enter the username to login <"Admin">
      And User enter password to login <"admin123">
      And User click on login button
      And Admin clicks on 'admin' tab
      And Admin verify 'system users' text
      And Admin click on 'add' button
      And Admin verify 'add user' text
      And Admin select user role <"Admin">
      And Admin enter employee name<"Ananya Dash">
      And Admin enter user name<"AnanyaDash20">
      And Admin select status <"Disabled">
      And Admin enter password <"anayapassword123">
      And Admin enter confirm password<"ananyapassword123">
      And Admin click on 'save' button
      Then Admin verify 'successfully saved' message

     @Sanity @Regression
     Scenario: Admin should search the user created and verify it
       Given Admin is on homepage
       When User enter the username to login <"Admin">
       And User enter password to login <"admin123">
       And User click on login button
       And Admin clicks on 'admin' tab
       And Admin verify 'system users' text
       And Admin click on 'add' button
       And Admin verify 'add user' text
       And Admin select user role <"Admin">
       And Admin enter employee name<"Ananya Dash">
       And Admin enter user name<"AnanyaDash20">
       And Admin select status <"Disabled">
       And Admin enter password <"anayapassword123">
       And Admin enter confirm password<"ananyapassword123">
       And Admin click on 'save' button
       And Admin verify 'successfully saved' message
       And Admin clicks on 'admin' tab
       And Admin verify 'system users' text from view system users page
       And Admin search for username <"AnanyaDash20">
       And Admin search for user role <"Admin">
       And Admin search for user status <"Disabled">
       And Admin click on 'search' button
       Then Admin should verify user found successfully

       @Sanity @Regression
       Scenario: Admin should delete user successfully
         Given Admin is on homepage
         When User enter the username to login <"Admin">
         And User enter password to login <"admin123">
         And User click on login button
         And Admin clicks on 'admin' tab
         And Admin verify 'system users' text
         And Admin click on 'add' button
         And Admin verify 'add user' text
         And Admin select user role <"Admin">
         And Admin enter employee name<"Ananya Dash">
         And Admin enter user name<"AnanyaDash20">
         And Admin select status <"Disabled">
         And Admin enter password <"anayapassword123">
         And Admin enter confirm password<"ananyapassword123">
         And Admin click on 'save' button
         And Admin verify 'successfully saved' message
         And Admin clicks on 'admin' tab
         And Admin verify 'system users' text from view system users page
         And Admin search for username <"AnanyaDash20">
         And Admin search for user role <"Admin">
         And Admin search for user status <"Disabled">
         And Admin click on 'search' button
         And Admin should verify user found successfully
         And Admin click on the checkbox
         And Admin click on 'delete' button
         And Admin click on 'OK' delete
         Then Admin verify user deleted text

    @Regression
    Scenario: Admin should serach for deleted user and verify no record found
      Given Admin is on homepage
      When User enter the username to login <"Admin">
      And User enter password to login <"admin123">
      And User click on login button
      And Admin clicks on 'admin' tab
      And Admin verify 'system users' text
      And Admin click on 'add' button
      And Admin verify 'add user' text
      And Admin select user role <"Admin">
      And Admin enter employee name<"Ananya Dash">
      And Admin enter user name<"AnanyaDash20">
      And Admin select status <"Disabled">
      And Admin enter password <"anayapassword123">
      And Admin enter confirm password<"ananyapassword123">
      And Admin click on 'save' button
      And Admin verify 'successfully saved' message
      And Admin clicks on 'admin' tab
      And Admin verify 'system users' text from view system users page
      And Admin search for username <"AnanyaDash20">
      And Admin search for user role <"Admin">
      And Admin search for user status <"Disabled">
      And Admin click on 'search' button
      And Admin should verify user found successfully
      And Admin click on the checkbox
      And Admin click on 'delete' button
      And Admin click on 'OK' delete
      And Admin verify user deleted text
      And Admin search for user role <"AnanyaDash20">
      And Admin search for user role <"Admin">
      And Admin search for user status <"Disabled">
      And Admin click on 'search' button
      Then Admin should verify <"No Records Found">
