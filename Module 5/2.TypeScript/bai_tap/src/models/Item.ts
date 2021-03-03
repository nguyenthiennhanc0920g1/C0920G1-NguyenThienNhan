interface Owner{
   login : String;
   id : number;
   nodeId : String;
   avatarUrl : String;
   gravatarId : String;
   url : String;
   htmlUrl : String;
   followerUrl : String;
   followingUrl : String;
   gistsUrl : String;
   starredUrl : String;
   subscriptionsUrl : String;
   organizationsUrl : String;
   reposUrl : String;
   eventsUrl : String;
   receivedEventsUrl : String;
   type : String;
   siteAdmin : boolean;
}
export interface Item {
   id : number;
   nodeId : String;
   name : String;
   fullName : String;
   _private : boolean;
   owner : Owner;
}