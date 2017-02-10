package com.qiang.senior.androidsenior;

import java.util.List;

/**
 * Created by wangQ
 * on 2017/2/10.
 */

public class Bean {

    /**
     * code : 0
     * message : Successful
     * data : {"contentType":"vod","id":"1084370","name":"香港（4K）","alias":"","subCaption":"","length":"2","type":"纪录片","typeCode":"15","programClass":"人文|自然","zone":"中国香港","director":"无","actor":"无","language":"普通话","maskDescription":"","releaseDate":"2015","ppvId":null,"hImg":"http://112.25.75.39/cos/cos/cos/hengban/xg4K108437023480.jpg","vImg":"http://images.is.ysten.com:8080/poster/2015-06-11/bf7f1fb83b9544d0adb7023af6f6ca77.jpg","catgId":"","isNew":"","information":"【影片简介】本片展示夜暮下的香港美景，灯火霓裳、美轮美奂。  【4K说明】本视频为4K节目，为保证流畅观看，需50M以上的有线独享带宽；针对4K电视机，请在机顶盒的\u201c通用设置\u201d中将分辨率选择\u201cHDMI 4K\u201d观看效果最佳。","relationlist":"","definition":"4K","cpcode":"CMS","specialLssueId":"CMS_1084370","programCount":"1","programTotalCount":"1","grade":"9.4","rcmLevel":"","playCounts":"1.1万","tag":"人文|自然","programNo":"","producer":"","character":"","audiences":"","subject":"","hours":"","publisher":"","competition":"","style":"","content":"","presenter":"","guests":"","contentDate":"","defaultDefinition":"","extInfo":"","specialInfo":"","playSort":"0","sources":[{"id":"13725649","programId":"13725649","mediaId":"651871294","name":"香港（4K）","fileSize":"97129448","trialDura":"10","setNumber":"1","poster":"","action":"OpenMedia","actionURL":"yst://077C712BB85A168D83B0492584E6F83466FB4BF82FE06453B90E812565447652664E56F45B3BEABD84DC001F9C1C27D5BC82A96C1B4380FB9F94F8998282D31F102BAAA16024AFD21235EE533220E8D09431DB48394541AD6CED3F65AEB58450FDC0BCC270A5157EAA3C698CE4EE852527A2A3CD7CE2F0BF3BFF0F568725BF25","definition":"4K","drmFlag":"false","is3D":"false","type3D":"0","specialInfo":"","cId":"","drmType":"","programSetId":"1084370","mediaType":"vod","channelUuid":""}],"corner":[{"cornerImg":"http://112.25.75.39:80/cos/cos/cos/specialpt/corner/rh4kjb.png","position":1}],"updateDate":"","isEnd":"0","channelName":"","channelLogo":""}
     */

    private String code;
    private String message;
    /**
     * contentType : vod
     * id : 1084370
     * name : 香港（4K）
     * alias :
     * subCaption :
     * length : 2
     * type : 纪录片
     * typeCode : 15
     * programClass : 人文|自然
     * zone : 中国香港
     * director : 无
     * actor : 无
     * language : 普通话
     * maskDescription :
     * releaseDate : 2015
     * ppvId : null
     * hImg : http://112.25.75.39/cos/cos/cos/hengban/xg4K108437023480.jpg
     * vImg : http://images.is.ysten.com:8080/poster/2015-06-11/bf7f1fb83b9544d0adb7023af6f6ca77.jpg
     * catgId :
     * isNew :
     * information : 【影片简介】本片展示夜暮下的香港美景，灯火霓裳、美轮美奂。  【4K说明】本视频为4K节目，为保证流畅观看，需50M以上的有线独享带宽；针对4K电视机，请在机顶盒的“通用设置”中将分辨率选择“HDMI 4K”观看效果最佳。
     * relationlist :
     * definition : 4K
     * cpcode : CMS
     * specialLssueId : CMS_1084370
     * programCount : 1
     * programTotalCount : 1
     * grade : 9.4
     * rcmLevel :
     * playCounts : 1.1万
     * tag : 人文|自然
     * programNo :
     * producer :
     * character :
     * audiences :
     * subject :
     * hours :
     * publisher :
     * competition :
     * style :
     * content :
     * presenter :
     * guests :
     * contentDate :
     * defaultDefinition :
     * extInfo :
     * specialInfo :
     * playSort : 0
     * sources : [{"id":"13725649","programId":"13725649","mediaId":"651871294","name":"香港（4K）","fileSize":"97129448","trialDura":"10","setNumber":"1","poster":"","action":"OpenMedia","actionURL":"yst://077C712BB85A168D83B0492584E6F83466FB4BF82FE06453B90E812565447652664E56F45B3BEABD84DC001F9C1C27D5BC82A96C1B4380FB9F94F8998282D31F102BAAA16024AFD21235EE533220E8D09431DB48394541AD6CED3F65AEB58450FDC0BCC270A5157EAA3C698CE4EE852527A2A3CD7CE2F0BF3BFF0F568725BF25","definition":"4K","drmFlag":"false","is3D":"false","type3D":"0","specialInfo":"","cId":"","drmType":"","programSetId":"1084370","mediaType":"vod","channelUuid":""}]
     * corner : [{"cornerImg":"http://112.25.75.39:80/cos/cos/cos/specialpt/corner/rh4kjb.png","position":1}]
     * updateDate :
     * isEnd : 0
     * channelName :
     * channelLogo :
     */

    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String contentType;
        private String id;
        private String name;
        private String alias;
        private String subCaption;
        private String length;
        private String type;
        private String typeCode;
        private String programClass;
        private String zone;
        private String director;
        private String actor;
        private String language;
        private String maskDescription;
        private String releaseDate;
        private String ppvId;
        private String hImg;
        private String vImg;
        private String catgId;
        private String isNew;
        private String information;
        private String relationlist;
        private String definition;
        private String cpcode;
        private String specialLssueId;
        private String programCount;
        private String programTotalCount;
        private String grade;
        private String rcmLevel;
        private String playCounts;
        private String tag;
        private String programNo;
        private String producer;
        private String character;
        private String audiences;
        private String subject;
        private String hours;
        private String publisher;
        private String competition;
        private String style;
        private String content;
        private String presenter;
        private String guests;
        private String contentDate;
        private String defaultDefinition;
        private String extInfo;
        private String specialInfo;
        private String playSort;
        private String updateDate;
        private String isEnd;
        private String channelName;
        private String channelLogo;
        /**
         * id : 13725649
         * programId : 13725649
         * mediaId : 651871294
         * name : 香港（4K）
         * fileSize : 97129448
         * trialDura : 10
         * setNumber : 1
         * poster :
         * action : OpenMedia
         * actionURL : yst://077C712BB85A168D83B0492584E6F83466FB4BF82FE06453B90E812565447652664E56F45B3BEABD84DC001F9C1C27D5BC82A96C1B4380FB9F94F8998282D31F102BAAA16024AFD21235EE533220E8D09431DB48394541AD6CED3F65AEB58450FDC0BCC270A5157EAA3C698CE4EE852527A2A3CD7CE2F0BF3BFF0F568725BF25
         * definition : 4K
         * drmFlag : false
         * is3D : false
         * type3D : 0
         * specialInfo :
         * cId :
         * drmType :
         * programSetId : 1084370
         * mediaType : vod
         * channelUuid :
         */

        private List<SourcesBean> sources;
        /**
         * cornerImg : http://112.25.75.39:80/cos/cos/cos/specialpt/corner/rh4kjb.png
         * position : 1
         */

        private List<CornerBean> corner;

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

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

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getSubCaption() {
            return subCaption;
        }

        public void setSubCaption(String subCaption) {
            this.subCaption = subCaption;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTypeCode() {
            return typeCode;
        }

        public void setTypeCode(String typeCode) {
            this.typeCode = typeCode;
        }

        public String getProgramClass() {
            return programClass;
        }

        public void setProgramClass(String programClass) {
            this.programClass = programClass;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getActor() {
            return actor;
        }

        public void setActor(String actor) {
            this.actor = actor;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getMaskDescription() {
            return maskDescription;
        }

        public void setMaskDescription(String maskDescription) {
            this.maskDescription = maskDescription;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getPpvId() {
            return ppvId;
        }

        public void setPpvId(String ppvId) {
            this.ppvId = ppvId;
        }

        public String getHImg() {
            return hImg;
        }

        public void setHImg(String hImg) {
            this.hImg = hImg;
        }

        public String getVImg() {
            return vImg;
        }

        public void setVImg(String vImg) {
            this.vImg = vImg;
        }

        public String getCatgId() {
            return catgId;
        }

        public void setCatgId(String catgId) {
            this.catgId = catgId;
        }

        public String getIsNew() {
            return isNew;
        }

        public void setIsNew(String isNew) {
            this.isNew = isNew;
        }

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String getRelationlist() {
            return relationlist;
        }

        public void setRelationlist(String relationlist) {
            this.relationlist = relationlist;
        }

        public String getDefinition() {
            return definition;
        }

        public void setDefinition(String definition) {
            this.definition = definition;
        }

        public String getCpcode() {
            return cpcode;
        }

        public void setCpcode(String cpcode) {
            this.cpcode = cpcode;
        }

        public String getSpecialLssueId() {
            return specialLssueId;
        }

        public void setSpecialLssueId(String specialLssueId) {
            this.specialLssueId = specialLssueId;
        }

        public String getProgramCount() {
            return programCount;
        }

        public void setProgramCount(String programCount) {
            this.programCount = programCount;
        }

        public String getProgramTotalCount() {
            return programTotalCount;
        }

        public void setProgramTotalCount(String programTotalCount) {
            this.programTotalCount = programTotalCount;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getRcmLevel() {
            return rcmLevel;
        }

        public void setRcmLevel(String rcmLevel) {
            this.rcmLevel = rcmLevel;
        }

        public String getPlayCounts() {
            return playCounts;
        }

        public void setPlayCounts(String playCounts) {
            this.playCounts = playCounts;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getProgramNo() {
            return programNo;
        }

        public void setProgramNo(String programNo) {
            this.programNo = programNo;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

        public String getAudiences() {
            return audiences;
        }

        public void setAudiences(String audiences) {
            this.audiences = audiences;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getHours() {
            return hours;
        }

        public void setHours(String hours) {
            this.hours = hours;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getCompetition() {
            return competition;
        }

        public void setCompetition(String competition) {
            this.competition = competition;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPresenter() {
            return presenter;
        }

        public void setPresenter(String presenter) {
            this.presenter = presenter;
        }

        public String getGuests() {
            return guests;
        }

        public void setGuests(String guests) {
            this.guests = guests;
        }

        public String getContentDate() {
            return contentDate;
        }

        public void setContentDate(String contentDate) {
            this.contentDate = contentDate;
        }

        public String getDefaultDefinition() {
            return defaultDefinition;
        }

        public void setDefaultDefinition(String defaultDefinition) {
            this.defaultDefinition = defaultDefinition;
        }

        public String getExtInfo() {
            return extInfo;
        }

        public void setExtInfo(String extInfo) {
            this.extInfo = extInfo;
        }

        public String getSpecialInfo() {
            return specialInfo;
        }

        public void setSpecialInfo(String specialInfo) {
            this.specialInfo = specialInfo;
        }

        public String getPlaySort() {
            return playSort;
        }

        public void setPlaySort(String playSort) {
            this.playSort = playSort;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        public String getIsEnd() {
            return isEnd;
        }

        public void setIsEnd(String isEnd) {
            this.isEnd = isEnd;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getChannelLogo() {
            return channelLogo;
        }

        public void setChannelLogo(String channelLogo) {
            this.channelLogo = channelLogo;
        }

        public List<SourcesBean> getSources() {
            return sources;
        }

        public void setSources(List<SourcesBean> sources) {
            this.sources = sources;
        }

        public List<CornerBean> getCorner() {
            return corner;
        }

        public void setCorner(List<CornerBean> corner) {
            this.corner = corner;
        }

        public static class SourcesBean {
            private String id;
            private String programId;
            private String mediaId;
            private String name;
            private String fileSize;
            private String trialDura;
            private String setNumber;
            private String poster;
            private String action;
            private String actionURL;
            private String definition;
            private String drmFlag;
            private String is3D;
            private String type3D;
            private String specialInfo;
            private String cId;
            private String drmType;
            private String programSetId;
            private String mediaType;
            private String channelUuid;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getProgramId() {
                return programId;
            }

            public void setProgramId(String programId) {
                this.programId = programId;
            }

            public String getMediaId() {
                return mediaId;
            }

            public void setMediaId(String mediaId) {
                this.mediaId = mediaId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFileSize() {
                return fileSize;
            }

            public void setFileSize(String fileSize) {
                this.fileSize = fileSize;
            }

            public String getTrialDura() {
                return trialDura;
            }

            public void setTrialDura(String trialDura) {
                this.trialDura = trialDura;
            }

            public String getSetNumber() {
                return setNumber;
            }

            public void setSetNumber(String setNumber) {
                this.setNumber = setNumber;
            }

            public String getPoster() {
                return poster;
            }

            public void setPoster(String poster) {
                this.poster = poster;
            }

            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            public String getActionURL() {
                return actionURL;
            }

            public void setActionURL(String actionURL) {
                this.actionURL = actionURL;
            }

            public String getDefinition() {
                return definition;
            }

            public void setDefinition(String definition) {
                this.definition = definition;
            }

            public String getDrmFlag() {
                return drmFlag;
            }

            public void setDrmFlag(String drmFlag) {
                this.drmFlag = drmFlag;
            }

            public String getIs3D() {
                return is3D;
            }

            public void setIs3D(String is3D) {
                this.is3D = is3D;
            }

            public String getType3D() {
                return type3D;
            }

            public void setType3D(String type3D) {
                this.type3D = type3D;
            }

            public String getSpecialInfo() {
                return specialInfo;
            }

            public void setSpecialInfo(String specialInfo) {
                this.specialInfo = specialInfo;
            }

            public String getCId() {
                return cId;
            }

            public void setCId(String cId) {
                this.cId = cId;
            }

            public String getDrmType() {
                return drmType;
            }

            public void setDrmType(String drmType) {
                this.drmType = drmType;
            }

            public String getProgramSetId() {
                return programSetId;
            }

            public void setProgramSetId(String programSetId) {
                this.programSetId = programSetId;
            }

            public String getMediaType() {
                return mediaType;
            }

            public void setMediaType(String mediaType) {
                this.mediaType = mediaType;
            }

            public String getChannelUuid() {
                return channelUuid;
            }

            public void setChannelUuid(String channelUuid) {
                this.channelUuid = channelUuid;
            }
        }

        public static class CornerBean {
            private String cornerImg;
            private int position;

            public String getCornerImg() {
                return cornerImg;
            }

            public void setCornerImg(String cornerImg) {
                this.cornerImg = cornerImg;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }
        }
    }
}
