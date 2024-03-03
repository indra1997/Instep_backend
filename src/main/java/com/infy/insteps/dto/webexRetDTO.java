package com.infy.insteps.dto;

import java.util.Date;

class AttendeePrivileges{
    public boolean enabledShareContent;
    public boolean enabledSaveDocument;
    public boolean enabledPrintDocument;
    public boolean enabledAnnotate;
    public boolean enabledViewParticipantList;
    public boolean enabledViewThumbnails;
    public boolean enabledRemoteControl;
    public boolean enabledViewAnyDocument;
    public boolean enabledViewAnyPage;
    public boolean enabledContactOperatorPrivately;
    public boolean enabledChatHost;
    public boolean enabledChatPresenter;
    public boolean enabledChatOtherParticipants;
}

 class AudioConnectionOptions{
    public String audioConnectionType;
    public boolean enabledTollFreeCallIn;
    public boolean enabledGlobalCallIn;
    public boolean enabledAudienceCallBack;
    public String entryAndExitTone;
    public boolean allowHostToUnmuteParticipants;
    public boolean allowAttendeeToUnmuteSelf;
    public boolean muteAttendeeUponEntry;
}

 class MeetingOptions{
    public boolean enabledChat;
    public boolean enabledVideo;
    public boolean enabledNote;
    public String noteType;
    public boolean enabledFileTransfer;
    public boolean enabledUCFRichMedia;
}

public class webexRetDTO{
    public String id;
    public String meetingNumber;
    public String title;
    public String password;
    public String phoneAndVideoSystemPassword;
    public String meetingType;
    public String state;
    public String timezone;
    public Date start;
    public Date end;
    public String hostUserId;
    public String hostDisplayName;
    public String hostEmail;
    public String hostKey;
    public String siteUrl;
    public String webLink;
    public String sipAddress;
    public String dialInIpAddress;
    public boolean enabledAutoRecordMeeting;
    public boolean allowAuthenticatedDevices;
    public boolean enabledJoinBeforeHost;
    public int joinBeforeHostMinutes;
    public boolean enableConnectAudioBeforeHost;
    public boolean excludePassword;
    public boolean publicMeeting;
    public boolean enableAutomaticLock;
    public String unlockedMeetingJoinSecurity;
    public MeetingOptions meetingOptions;
    public AttendeePrivileges attendeePrivileges;
    public int sessionTypeId;
    public String scheduledType;
    public SimultaneousInterpretation simultaneousInterpretation;
    public boolean enabledVisualWatermark;
    public boolean enabledBreakoutSessions;
    public AudioConnectionOptions audioConnectionOptions;
}

 class SimultaneousInterpretation{
    public boolean enabled;
}
