package Resource;

public class TestElement {

    // login setup test element
    public static final String BASE_URL = "base_url";
    public static final String SETUP_CODE = "setup_code";
    public static final String BTN_INSTALL = "btn_install";
    public static final String INPUT_USERNAME = "input_username";
    public static final String INPUT_PASSWORD = "input_password";
    public static final String BTN_SUBMIT = "btn_submit";
    public static final String OPT_YES_ELEMENT = "yes";
    public static final String OPT_NO_ELEMENT = "no";
    public static final String POPUP_MESSAGE_ELEMENT = "android:id/message";

    //dashboard test element

    public static final String DASHBOARD_TIME_CLOCK_ELEMENT = "dashboard_time_clock";
    public static final String DASHBOARD_CHANGE_POSITION_ELEMENT = "dashboard_change_position";
    public static final String DASHBOARD_CHECKPOINTS_ELEMENT = "(//android.widget.ImageView[@content-desc=\"Dashboard Item\"])[3]";
    public static final String DASHBOARD_REPORT_LOGS_ELEMENT = "dashboard_reports_logs";
    public static final String DASHBOARD_MESSAGE_BOARD_ELEMENT = "(//android.widget.ImageView[@content-desc=\"Dashboard Item\"])[6]\n";
    public static final String DASHBOARD_LONE_WORKER_ELEMENT = "dashboard_lone_worker";
    public static final String DASHBOARD_POST_ESCALATION_ELEMENT = "dashboard_post_escalation";
    public static final String DASHBOARD_VISITOR_LOG_ELEMENT = "(//android.widget.ImageView[@content-desc=\"Dashboard Item\"])[9]";
    public static final String DASHBOARD_ASSET_MANAGEMENT_ELEMENT = "dashboard_asset_management";
    public static final String DASHBOARD_EMERGENCY_CONTACTS_ELEMENT = "dashboard_emergency_contacts";
    public static final String DASHBOARD_FLASHLIGHT_ELEMENT = "dashboard_flashlight";
    public static final String DASHBOARD_CCTV_ELEMENT = "dashboard_cctv";
    public static final String DASHBOARD_SCHEDULES_ELEMENT = "dashboard_schedules";
    public static final String DASHBOARD_WATCH_MODE_ELEMENT = "dashboard_watch_mode";
    public static final String DASHBOARD_PANIC_BUTTON_ELEMENT = "dashboard_panic_button";
    public static final String DASHBOARD_SETTINGS_ELEMENT = "dashboard_settings";
    public static final String DASHBOARD_DISPATCH_TASKS_ELEMENT = "(//android.widget.ImageView[@content-desc=\"Dashboard Item\"])[5]";
    public static final String DASHBOARD_TEAM_ELEMENT = "//android.widget.TextView[@text='TEAM']";
    public static final String DASHBOARD_RUNSHEET_ELEMENT = "runsheet";
    public static final String DASHBOARD_SITES_ELEMENT = "(//android.widget.ImageView[@content-desc=\"Dashboard Item\"])[2]";

    //break management test element

    public static final String START_BREAK_ELEMENT = "//android.widget.RelativeLayout[@content-desc=\"start_break\"]/android.widget.TextView";
    public static final String SESSION_BREAK_INFO_ELEMENT = "com.staffr.app:id/break_notif";
    public static final String BTN_CANCEL_ELEMENT = "cancel";
    public static final String END_BREAK_ELEMENT = "end_break";
    public static final String CLOCK_OUT_SIGN_OUT_ELEMENT = "clock_out_and_sign_out";
    public static final String REMOVE_DEPARTMENT_LICENSE_ELEMENT = "com.staffr.app:id/page_title";
    public static final String REMOVE_LICENSE_OPTION_ELEMENT = "android:id/button1";
    public static final String BYOD_CLOCK_IN_ELEMENT = "com.staffr.app:id/byod_clock_in";
    public static final String BYOD_TO_EARLY_TO_CLOCKED_IN ="android:id/button1";
    public static final String CLOCK_IN_ELEMENT = "clock_in";
    public static final String LOGIN_POPUP_WINDOWS_ELEMENT = "android:id/button1";
    public static final String MENU_ON_ELEMENT = "menu_on";
    public static final String MENU_STANDBY_ELEMENT = "menu_standby";
    public static final String MENU_OFF_ELEMENT = "menu_off";

    // position test element

    public static final String POSITION_SEARCH_BAR_ELEMENT = "search_bar";
    public static final String SELECT_POSITION_ELEMENT = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.TextView[1]\n";
    public static final String POSITION_BTN_CANCEL_ELEMENT = "//android.widget.Button[@text='CANCEL']";
    public static final String POSITION_BTN_OK_ELEMENT = "//android.widget.Button[@content-desc=\"yes\"]";

    //checkpoint test element

    public static final String START_A_TOUR_ELEMENT = "//android.widget.RelativeLayout[@content-desc=\"start_a_tour\"]/android.widget.TextView";
    public static final String SELECT_TOUR_ELEMENT = "//android.widget.LinearLayout[@content-desc=\"row_0\"]/android.widget.TextView[1]";
    public static final String TOUR_SHOW_MORE_ELEMENT = "show_more";
    public static final String TOUR_SHOW_LESS_ELEMENT = "show_more";
    public static final String CHECKPOINT1_ELEMENT = "//android.widget.TextView[@text='CheckPoint1']";
    public static final String CHECKPOINT2_ELEMENT = "//android.widget.TextView[@text='CheckPoint2']";
    public static final String CHECKPOINT3_ELEMENT = "//android.widget.TextView[@text='CheckPoint3']";
    public static final String CHECKPOINT4_ELEMENT = "//android.widget.TextView[@text='CheckPoint4']";
    public static final String CHECKPOINT5_ELEMENT = "//android.widget.TextView[@text='CheckPoint5']";
    public static final String CHECKPOINT_GPS_ELEMENT = "//android.widget.TextView[@text='CheckPoints with GPS']";
    public static final String CHECKPOINT_CHOOSE_REASON_ELEMENT = "//android.widget.TextView[@text='Checkpoint cannot be accessed']";
    public static final String CHECKPOINT_WITH_REPORT_ELEMENT = "//android.widget.TextView[@text='Checkpoints With Report Requires']";
    public static final String FINISH_TOUR_ELEMENT = "//android.widget.Button[@text='Finish Tour']";

    //mobile dispatch test element

    public static final String MOBILE_DISPATCH_BTN_RELOAD_ELEMENT= "com.staffr.app:id/but_reload";
    public static final String MOBILE_DISPATCH_SHOW_MORE_ELEMENT = "com.staffr.app:id/text_show_more";
    public static final String SELECT_DISPATCH_TASK_ELEMENT = "//android.widget.TextView[@bounds='[28,447][983,491]']";
    public static final String MOBILE_DISPATCH_BTN_COMMENT_ELEMENT = "//android.widget.TextView[@text='Comments']";
    public static final String MOBILE_DISPATCH_BTN_ADD_COMMENTS_ELEMENT = "com.staffr.app:id/add_comment";
    public static final String MOBILE_DISPATCH_ADD_COMMENTS_ELEMENT = "//android.widget.EditText[@bounds='[72,952][1008,1243]']";
    public static final String MOBILE_DISPATCH_SEND_COMMENTS_ELEMENT = "//android.widget.Button[@text='SEND']";
    public static final String MOBILE_DISPATCH_INFO_ELEMENT = "//android.widget.TextView[@text='Info']";
    public static final String MOBILE_DISPATCH_BTN_NAVIGATE_ELEMENT = "com.staffr.app:id/but_nav";
    public static final String MOBILE_DISPATCH_BTN_REFUSE_ELEMENT = "//android.widget.Button[@text='Refuse']";
    public static final String MOBILE_DISPATCH_BTN_ACCEPTED_PENDING_ELEMENT = "//android.widget.Button[@text='Accepted: Pending']";
    public static final String MOBILE_DISPATCH_BTN_ON_THE_WAY_EDIT_ELEMENT = "//android.widget.Button[@text='Transition Edit: On The Way']";
    public static final String MOBILE_DISPATCH_BTN_ON_THE_WAY_ELEMENT = "//android.widget.Button[@text='On the Way']";
    public static final String MOBILE_DISPATCH_BTN_FILL_OUT_REPORT_ELEMENT = "com.staffr.app:id/but_report";
    public static final String MOBILE_DISPATCH_BTN_SEND_ELEMENT = "//android.widget.Button[@text='Send']";
    public static final String MOBILE_DISPATCH_BTN_ARRIVED_ON_SITE_ELEMENT = "//android.widget.Button[@text='Arrived On Site']";
    public static final String MOBILE_DISPATCH_BTN_ALL_CLEAR_ELEMENT = "//android.widget.Button[@text='All Clear; Report Completed']";

    //emergency contact test element

    public static final String EMERGENCY_CONTACT_ELEMENT = "//android.widget.TextView[@text='Max Emergency']";

    //logout test element

    public static final String LOGOUT_START_BREAK_ELEMENT = "start_break";
    public static final String LOGOUT_END_BREAK_ELEMENT = "end_break";
    public static final String LOGOUT_CANCEL_ELEMENT = "cancel";
    public static final String LOGOUT_CLOCK_OUT_SIGN_IN_ELEMENT = "clock_out_and_stay_signed_in";
    public static final String LOGOUT_SIGN_OUT_ELEMENT = "sign_out";
    public static final String LOGOUT_CLOCK_OUT_SIGN_OUT_ELEMENT = "clock_out_and_sign_out";
    public static final String LOGOUT_SITE_LICENSE_ELEMENT = "com.staffr.app:id/page_title";
    public static final String LOGOUT_REMOVE_LICENSE_OPTION = "android:id/button1";

    //message board test element

    public static final String MESSAGE_BOARD_POST_NEW_MESSAGE_ELEMENT = "//android.widget.RelativeLayout[@content-desc=\"post_a_new_message\"]/android.widget.TextView";
    public static final String MESSAGE_BOARD_CATEGORY_ELEMENT = "list_picker";
    public static final String MESSAGE_BOARD_ANNOUNCEMENT_OPTION_ELEMENT = "//android.widget.CheckedTextView[@text='Announcement']";
    public static final String MESSAGE_BOARD_COMMENT_BOX_ELEMENT = "comment_box";
    public static final String MESSAGE_BOARD_INCREASE_MONTH_ELEMENT = "Increase month";
    public static final String MESSAGE_BOARD_DECREASE_MONTH_ELEMENT = "Decrease month";
    public static final String MESSAGE_BOARD_INCREASE_DAY_ELEMENT = "Increase day";
    public static final String MESSAGE_BOARD_DECREASE_DAY_ELEMENT = "Decrease day";
    public static final String MESSAGE_BOARD_INCREASE_YEAR_ELEMENT = "Increase year";
    public static final String MESSAGE_BOARD_DECREASE_YEAR_ELEMENT = "Decrease year";
    public static final String MESSAGE_BOARD_PICTURE_ELEMENT = "picture";
    public static final String MESSAGE_BOARD_TAKE_PHOTO_ELEMENT = "Shutter";
    public static final String MESSAGE_BOARD_PHOTO_DONE_ELEMENT = "Done";
    public static final String MESSAGE_BOARD_BTN_SEND_ELEMENT = "button_send";
    public static final String MESSAGE_BOARD_NEW_MESSAGE_ELEMENT = "new_messages";
    public static final String MESSAGE_BOARD_SEARCH_BAR_ELEMENT = "search_bar";
    public static final String MESSAGE_BOARD_SELECT_NEW_MESSAGE_ELEMENT = "//android.widget.LinearLayout[@bounds='[22,500][1080,1146]']";
    public static final String MESSAGE_SEARCH_01= "//android.widget.RelativeLayout[@content-desc=\"row_0\"]/android.widget.LinearLayout/android.widget.TextView[1]";
    public static final String MESSAGE_BOARD_UNACKNOWLEDGED_MESSAGE_ELEMENT = "//android.widget.RelativeLayout[@content-desc=\"test_messageboard_unacknowledge\"]/android.widget.TextView";
    public static final String MESSAGE_BOARD_ACKNOWLEDGE_ARCHIVE_MESSAGE_ELEMENT = "//android.widget.RelativeLayout[@content-desc=\"test_messageboard_acknowledge_and_archive\"]/android.widget.TextView";
    public static final String MESSAGE_BOARD_ACKNOWLEDGE_MESSAGE_ELEMENT = "test_messageboard_acknowledge";
    public static final String MESSAGE_BOARD_ARCHIVE_MESSAGE_ELEMENT = "test_messageboard_archive";

    //panic button test element

    public static final String PANIC_BUTTON_BTN_CANCEL_ELEMENT = "but_cancel";
    public static final String PANIC_BUTTON_BTN_MESSAGE_OK_ELEMENT = "android:id/button1";
    public static final String PANIC_BUTTON_BTN_CALL_ELEMENT = "but_call";

    //permission access test element

    public static final String PERMISSION_ACCESS_ALLOW_BTN_ELEMENT = "com.android.permissioncontroller:id/permission_allow_button";
    public static final String PERMISSION_ACCESS_ALLOW_FOB_ELEMENT = "com.android.permissioncontroller:id/permission_allow_foreground_only_button";

    //post escalation test element

    public static final String POST_ESCALATION_SEARCH_POST_ELEMENT = "search_bar";
    public static final String POST_ESCALATION_POST_ORDER_ELEMENT = "com.staffr.app:id/text_section";
    public static final String POST_ESCALATION_BTN_ACKNOWLEDGE_ELEMENT = "//android.widget.Button[@text='Acknowledge']";
    public static final String POST_ESCALATION_BTN_UNACKNOWLEDGED_ELEMENT = "//android.widget.Button[@text='Unacknowledge']";

    //report browse test element

    public static final String REPORT_BROWSE_ELEMENT = "browse_site_reports";
    public static final String REPORT_BROWSE_VIEW_MY_SITE_REPORT_ELEMENT = "//android.widget.TextView[@text='View My Site Reports']";
    public static final String REPORT_BROWSE_SEARCH_REPORT_ELEMENT = "search_bar";
    public static final String REPORT_BROWSE_SELECT_VIEW_REPORT_LIST_ELEMENT = "android:id/text1";
    public static final String REPORT_BROWSE_CHOOSE_OPTION_VIEW_ELEMENT = "//android.widget.TextView[@text='View']";
    public static final String REPORT_BROWSE_SELECT_EDIT_REPORT_LIST_ELEMENT = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    public static final String REPORT_BROWSE_CHOOSE_OPTION_EDIT_ELEMENT = "//android.widget.TextView[@text='Edit']";
    public static final String REPORT_BROWSE_EDIT_TEXT_BOX_ELEMENT = "text_box";
    public static final String REPORT_BROWSE_EDIT_COMMENT_BOX_ELEMENT = "comment_box";
    public static final String REPORT_BROWSE_EDIT_NUMBER_ELEMENT = "number";
    public static final String REPORT_BROWSE_EDIT_PICTURE_ELEMENT = "picture";
    public static final String REPORT_BROWSE_TAKE_PHOTO_ELEMENT = "com.staffr.app:id/shutter_button";
    public static final String REPORT_BROWSE_PHOTO_DONE_ELEMENT = "Done";
    public static final String REPORT_BROWSE_GALLERY_PICTURE_ELEMENT = "gallery_picture";
    public static final String REPORT_BROWSE_SELECT_PICTURE_ELEMENT = "com.android.documentsui:id/icon_thumb";
    public static final String REPORT_BROWSE_SIGNATURE_SECTION_ELEMENT = "signature_section";
    public static final String REPORT_BROWSE_SIGN_CLEAR_ELEMENT = "sign_clear";
    public static final String REPORT_BROWSE_SIGN_DONE_ELEMENT = "sign_done";
    public static final String REPORT_BROWSE_EDIT_CHECKBOX_ELEMENT = "report_checkbox";
    public static final String REPORT_BROWSE_LIST_INCIDENT_ELEMENT = "//android.widget.EditText[@text='150-B) Unsecured / Window (150-B)']";
    public static final String REPORT_BROWSE_SELECT_LIST_INCIDENT_ELEMENT = "//android.widget.TextView[@text='150-B) Unsecured / Window (150-B)']";
    public static final String REPORT_BROWSE_UNSECURED_TYPE_ELEMENT = "(//android.widget.Spinner[@content-desc=\"list_picker\"])[1]/android.widget.TextView";
    public static final String REPORT_BROWSE_CHOOSE_ONE_ELEMENT = "//android.widget.CheckedTextView[@text='Broken']";
    public static final String REPORT_BROWSE_LIST_PICKER_ELEMENT = "(//android.widget.Spinner[@content-desc=\"list_picker\"])[2]";
    public static final String REPORT_BROWSE_CHOOSE_ONE2_ELEMENT = "//android.widget.CheckedTextView[@text='front door']";
    public static final String REPORT_BROWSE_DRAW_VEHICLE_ELEMENT = "draw_vehicle";
    public static final String REPORT_BROWSE_DRAW_VEHICLE_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_BROWSE_DRAW_VEHICLE_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_BROWSE_DRAW_INJURY_ELEMENT = "draw_injury";
    public static final String REPORT_BROWSE_DRAW_INJURY_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_BROWSE_DRAW_INJURY_ELEMENT_DONE = "com.staffr.app:id/done";
    public static final String REPORT_BROWSE_DRAW_TRAILER_ELEMENT = "draw_trailer";
    public static final String REPORT_BROWSE_DRAW_TRAILER_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_BROWSE_DRAW_TRAILER_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_BROWSE_DRAW_GOLF_CART_ELEMENT = "draw_golf_cart";
    public static final String REPORT_BROWSE_DRAW_GOLF_CART_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_BROWSE_DRAW_GOLF_CART_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_BROWSE_INCREASE_HOUR_ELEMENT = "Increase hour";
    public static final String REPORT_BROWSE_DECREASE_HOUR_ELEMENT = "Decrease hour";
    public static final String REPORT_BROWSE_INCREASE_MONTH_ELEMENT = "Increase month";
    public static final String REPORT_BROWSE_DECREASE_MINUTE_ELEMENT = "Decrease minute";
    public static final String REPORT_BROWSE_DECREASE_DAY_ELEMENT = "Decrease day";
    public static final String REPORT_BROWSE_INCREASE_YEAR_ELEMENT = "Increase year";
    public static final String REPORT_BROWSE_BUTTON_SEND_ELEMENT = "button_send";

    //report create test element

    public static final String REPORT_CREATE_ELEMENT = "//android.widget.RelativeLayout[@content-desc=\"create_new_report\"]/android.widget.TextView";
    public static final String REPORT_CREATE_SEARCH_REPORT_ELEMENT = "//android.widget.EditText[@content-desc=\"search_bar\"]";
    public static final String REPORT_CREATE_CUSTOM_REPORT_ELEMENT = "//android.widget.LinearLayout[@content-desc=\"row_0\"]/android.widget.TextView[1]";
    public static final String REPORT_CREATE_TEXT_BOX_ELEMENT = "text_box";
    public static final String REPORT_CREATE_COMMENT_BOX_ELEMENT = "comment_box";
    public static final String REPORT_CREATE_NUMBER_ELEMENT = "number";
    public static final String REPORT_CREATE_PICTURE_ELEMENT = "picture";
    public static final String REPORT_CREATE_TAKE_PHOTO_ELEMENT = "com.staffr.app:id/shutter_button";

    public static final String REPORT_CREATE_OK_PHOTO_ELEMENT = "com.staffr.app:id/ok_btn";
    public static final String REPORT_CREATE_PHOTO_DONE_ELEMENT = "Done";
    public static final String REPORT_CREATE_GALLERY_PICTURE_ELEMENT = "gallery_picture";
    public static final String REPORT_CREATE_SELECT_PICTURE_ELEMENT = "com.android.documentsui:id/icon_thumb";
    public static final String REPORT_CREATE_SIGNATURE_SECTION_ELEMENT = "signature_section";
    public static final String REPORT_CREATE_SIGN_CLEAR_ELEMENT = "sign_clear";
    public static final String REPORT_CREATE_SIGN_DONE_ELEMENT = "sign_done";
    public static final String REPORT_CREATE_CHECKBOX_ELEMENT = "report_checkbox";
    public static final String REPORT_CREATE_LIST_INCIDENT_ELEMENT = "//android.widget.EditText[@text='- Choose one']";
    public static final String REPORT_CREATE_UNSECURED_DOOR_ELEMENT = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[9]/android.widget.TextView";
    public static final String REPORT_CREATE_UNSECURED_TYPE_ELEMENT = "//android.widget.TextView[@text='- Choose one']";
    public static final String REPORT_CREATE_CHOOSE_TYPE_ELEMENT = "//android.widget.CheckedTextView[@text='Open']";
    public static final String REPORT_CREATE_LIST_PICKER_ELEMENT = "//android.widget.TextView[@text='- Choose one']";
    public static final String REPORT_CREATE_SELECT_POSITION_ELEMENT = "//android.widget.CheckedTextView[@text='entry']";
    public static final String REPORT_CREATE_DRAW_VEHICLE_ELEMENT = "draw_vehicle";
    public static final String REPORT_CREATE_DRAW_VEHICLE_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_CREATE_DRAW_VEHICLE_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_CREATE_DRAW_INJURY_ELEMENT = "//android.widget.Button[@content-desc=\"draw_injury\"]";
    public static final String REPORT_CREATE_DRAW_INJURY_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_CREATE_DRAW_INJURY_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_CREATE_DRAW_TRAILER_ELEMENT = "draw_trailer";
    public static final String REPORT_CREATE_DRAW_TRAILER_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_CREATE_DRAW_TRAILER_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_CREATE_DRAW_GOLF_CART_ELEMENT = "draw_golf_cart";
    public static final String REPORT_CREATE_DRAW_GOLF_CART_CLEAR_ELEMENT = "com.staffr.app:id/clear";
    public static final String REPORT_CREATE_DRAW_GOLF_CART_DONE_ELEMENT = "com.staffr.app:id/done";
    public static final String REPORT_CREATE_INCREASE_HOUR_ELEMENT = "Increase hour";
    public static final String REPORT_CREATE_DECREASE_HOUR_ELEMENT = "Decrease hour";
    public static final String REPORT_CREATE_INCREASE_MINUTE_ELEMENT = "Increase minute";
    public static final String REPORT_CREATE_DECREASE_MINUTE_ELEMENT = "Decrease minute";
    public static final String REPORT_CREATE_SET_PM_ELEMENT = "Set PM";
    public static final String REPORT_CREATE_SET_AM_ELEMENT = "Set AM";
    public static final String REPORT_CREATE_INCREASE_YEAR_ELEMENT = "Increase year";
    public static final String REPORT_CREATE_DECREASE_YEAR_ELEMENT = "Decrease year";
    public static final String REPORT_CREATE_INCREASE_MONTH_ELEMENT = "Increase month";
    public static final String REPORT_CREATE_DECREASE_MONTH_ELEMENT = "Decrease month";
    public static final String REPORT_CREATE_INCREASE_DAY_ELEMENT = "Increase day";
    public static final String REPORT_CREATE_DECREASE_DAY_ELEMENT = "Decrease day";
    public static final String REPORT_CREATE_BUTTON_SEND_ELEMENT = "button_send";

    //run sheet test element

    public static final String RUNSHEET_SELECT_RUNSHEET_ELEMENT = "com.staffr.app:id/current_runsheet_name";
    public static final String RUNSHEET_SELECT_CURRENT_RUNSHEET_ELEMENT = "//android.widget.TextView[@text='Thursday / 09:00 AM - 05:00 PM / Position_Test / Automation Testing Runsheet']";
    public static final String RUNSHEET_START_RUNSHEET_ELEMENT = "android:id/button1";
    public static final String RUNSHEET_BTN_RUNSHEET_RELOAD_ELEMENT = "com.staffr.app:id/runsheet_reload";
    public static final String RUNSHEET_BTN_OK_ELEMENT = "android:id/button1";
    public static final String RUNSHEET_SEARCH_BAR_ELEMENT = "search_bar";
    public static final String RUNSHEET_ON_ROUTE_ELEMENT = "//android.widget.TextView[@text='On Route']";
    public static final String RUNSHEET_CHOOSE_RUNSHEET_ELEMENT = "row_0";
    public static final String RUNSHEET_NAVIGATE_TO_SITE_ELEMENT = "en_route_start_navigation";
    public static final String RUNSHEET_CURRENT_RUNSHEET_TASK_ELEMENT = "com.staffr.app:id/runsheet_current_job_tile";
    public static final String RUNSHEET_POSTPONE_LATER_ELEMENT = "//android.widget.TextView[@text='Postpone to Later']";
    public static final String RUNSHEET_BTN_YES_OPTION_ELEMENT = "//android.widget.Button[@text='YES']";
    public static final String RUNSHEET_REQUEST_REASSIGNMENT_ELEMENT = "request_reassignment";
    public static final String RUNSHEET_ARRIVE_ON_SITE_ELEMENT = "arrived_on_site";
    public static final String RUNSHEET_VIEW_SITE_INSTRUCTION_ELEMENT = "//android.widget.TextView[@text='View Site Instructions']";
    public static final String RUNSHEET_VIEW_SITE_POST_ORDERS_ELEMENT = "//android.widget.TextView[@text='View Site Post Orders']";
    public static final String RUNSHEET_FINISH_JOB_ELEMENT = "//android.widget.TextView[@text='Finish Job and Complete Report']";
    public static final String RUNSHEET_BTN_OPTIMIZE_ELEMENT = "//android.widget.Button[@text='Optimize']";
    public static final String RUNSHEET_BTN_FINISH_ELEMENT = "//android.widget.Button[@text='Finish']";

    //schedule test element

    public static final String SCHEDULES_SCHEDULE_USER_SEARCH_ELEMENT = "//android.widget.EditText[@bounds='[44,381][404,458]']";
    public static final String SCHEDULES_SEARCH_CLEAR_ELEMENT = "//android.widget.Button[@text='Clear']";
    public static final String SCHEDULES_SCHEDULE_ELEMENT = "//android.view.View[@text='Maxwell Qiu @ Maxwell_Department']";
    public static final String SCHEDULES_SEARCH_USER ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.MenuItem/android.view.View";
    //setting test element

    public static final String SETTING_DASHBOARD_ELEMENT = "dashboard_settings";
    public static final String SETTING_CHANGE_PIN_ELEMENT = "change_pin";
    public static final String SETTING_PIN_NUMBER_ELEMENT = "com.staffr.app:id/but_keypad_1";
    public static final String SETTING_CHANGE_PASSWORD_ELEMENT = "change_password";
    public static final String SETTING_OLD_PASSWORD_ELEMENT = "com.staffr.app:id/input_password_old";
    public static final String SETTING_NEW_PASSWORD_ELEMENT = "com.staffr.app:id/input_password2";
    public static final String SETTING_CONFIRMED_NEW_PASSWORD_ELEMENT = "com.staffr.app:id/input_password1";
    public static final String SETTING_BUTTON_SAVE_ELEMENT = "com.staffr.app:id/but_submit";
    public static final String SETTING_DASHBOARD_TIME_CLOCK_ELEMENT = "dashboard_time_clock";
    public static final String SETTING_SIGN_OUT_ELEMENT = "clock_out_and_sign_out";
    public static final String SETTING_USERNAME_ELEMENT = "input_username";
    public static final String SETTING_PASSWORD_ELEMENT = "input_password";
    public static final String SETTING_SIGN_IN_ELEMENT = "btn_submit";
    public static final String SETTING_CLOCK_IN_ELEMENT = "clock_in";
    public static final String SETTING_RELOAD_SETTING_ELEMENT = "reload_phone_settings";
    public static final String SETTING_POPUP_WINDOWS_ELEMENT = "android:id/button1";
    public static final String SETTING_CLOCK_OUT_SIGN_IN_ELEMENT = "clock_out_and_stay_signed_in";
    public static final String SETTING_SYNCHRONIZATION_ELEMENT = "synchronization_status";
    public static final String SETTING_RELOAD_ELEMENT = "com.staffr.app:id/but_reload";
    public static final String SETTING_SYSTEM_DIAGNOSTICS_ELEMENT = "system_diagnostics";
    public static final String SETTING_BARCODE_SCANNER_ELEMENT = "barcode_scanner_settings";
    public static final String SETTING_CHECK_BOX_ELEMENT = "com.staffr.app:id/checkbox_use_barcode_scanner";
    public static final String SETTING_BTN_OK_ELEMENT = "android:id/button1";

    //site test element

    public static final String SITES_SEARCH_BAR_ELEMENT = "com.staffr.app:id/filter";
    public static final String SITES_SELECT_STIES_ELEMENT = "//android.widget.TextView[@text='Maxwell_Site1']";
    public static final String SITES_SIGN_IN_TO_SITE_ELEMENT = "//android.widget.TextView[@text='Sign in to Site']";
    public static final String SITES_NAVIGATE_TO_SITE_ELEMENT = "//android.widget.TextView[@text='Navigate to Site']";
    public static final String SITES_VIEW_SITE_SCHEDULE_ELEMENT = "//android.widget.TextView[@text='View Site Schedule']";
    public static final String SITES_BTN_OK_ELEMENT = "android:id/button1";
    public static final String SITES_SITE_DESCRIPTION_ELEMENT = "com.staffr.app:id/site_description";
    public static final String SITES_LEAVE_SITE_MESSAGE_ELEMENT = "com.staffr.app:id/site_notif";
    public static final String SITES_SITE_COUNTER_ELEMENT = "com.staffr.app:id/site_counter";
    public static final String SITES_OPTION_OK_ELEMENT = "android:id/button1";
    public static final String SITES_DASHBOARD_SITES_ELEMENT = "//android.widget.TextView[@text='SITES']";

    //team test element

    public static final String TEAM_SEARCH_BAR_ELEMENT = "com.staffr.app:id/filter";
    public static final String TEAM_SELECT_MEMBER_ELEMENT = "//android.widget.TextView[@text='Maxwell Qiu']";
    public static final String TEAM_CALL_MEMBER_ELEMENT = "android:id/text1";

    //visitor log test element

    public static final String VISITOR_LOG_DASHBOARD_ELEMENT = "dashboard_visitor_log";
    public static final String VISITOR_LOG_LOGIN_A_VISITOR_ELEMENT = "log_in_a_visitor";
    public static final String VISITOR_LOG_SELECT_VISITOR_ELEMENT = "row_0";
    public static final String VISITOR_LOG_FIRST_NAME_ELEMENT = "//android.widget.EditText[@bounds='[55,465][1025,574]']";
    public static final String VISITOR_LOG_LAST_NAME_ELEMENT = "//android.widget.EditText[@bounds='[55,655][1025,764]']";
    public static final String VISITOR_LOG_SELECT_HOST_ELEMENT = "//android.widget.EditText[@text='Type to seach host...']";
    public static final String VISITOR_SELECT_HOST_FROM_LIST_ELEMENT = "android.widget.EditText";
    public static final String VISITOR_LOG_SEND_BUTTON_ELEMENT = "button_send";
    public static final String VISITOR_LOG_VIEW_CURRENT_VISITORS_ELEMENT = "view_current_visitors";
    public static final String VISITOR_LOG_SCAN_DRIVER_LICENSE_ELEMENT = "scan_driver_license";
    public static final String VISITOR_LOG_BUTTON_BACK_ELEMENT = "com.staffr.app:id/defaultBackButton";
    public static final String VISITOR_LOG_RELOAD_SETTINGS_ELEMENT = "reload_visitor_settings";
    public static final String VISITOR_LOG_SEARCH_VISITORS_ELEMENT = "search_visitors";
    public static final String VISITOR_LOG_SEARCH_VISITOR_SEARCH_BAR_ELEMENT = "com.staffr.app:id/filter";
    public static final String VISITOR_LOG_SELECT_VISITOR_LIST_ELEMENT = "//android.widget.TextView[@text='Maxwell Qiu']";
    public static final String VISITOR_LOG_VIEW_PROFILE_OPTION_ELEMENT = "test_visitor_view_profile";
    public static final String VISITOR_LOG_HISTORY_TAB_ELEMENT = "test_visitor_history_tab";
    public static final String VISITOR_LOG_ACTIONS_BUTTON_ELEMENT = "test_visitor_actions";
    public static final String VISITOR_LOG_CHECKOUT_ELEMENT = "test_profile_option_check_out";
    public static final String VISITOR_LOG_CURRENT_VISITOR_SEARCH_ELEMENT = "com.staffr.app:id/filter";
    public static final String VISITOR_LOG_SELECT_CURRENT_VISITOR_ELEMENT = "com.staffr.app:id/text1";
    public static final String VISITOR_LOG_CHECKOUT_VISITOR_ELEMENT = "//android.widget.TextView[@text='Check Out this Visitor']";
    public static final String VISITOR_LOG_BUTTON_OK_ELEMENT = "//android.widget.Button[@text='OK']";
    public static final String VISITOR_LOG_VISITOR_CHECK_IN_ELEMENT = "test_visitor_check_in";
    public static final String VISITOR_LOG_VISITOR_TYPE_ELEMENT = "//android.widget.TextView[@text='Visitor']";
    public static final String VISITOR_LOG_BTN_OK_WARNING_ELEMENT = "android:id/button1";


    //watch mode test element

    public static final String WATCH_MODE_START_REAR_ELEMENT = "test_watchmode_start_rear";
    public static final String WATCH_MODE_START_FRONT_ELEMENT = "test_watchmode_start_front";
    public static final String WATCH_MODE_START_WITH_FLASH_ELEMENT = "test_watchmode_start_with_flash";
    public static final String WATCH_MODE_STOP_RECORDING_ELEMENT = "//android.widget.Button[@content-desc=\"test_watchmode_stop\"]";
}
