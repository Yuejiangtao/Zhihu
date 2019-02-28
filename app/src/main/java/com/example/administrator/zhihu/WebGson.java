package com.example.administrator.zhihu;

import java.util.List;

public class WebGson {

    /**
     * body : <div class="main-wrap content-wrap">
     * <div class="headline">
     *
     * <div class="img-place-holder"></div>
     *
     *
     *
     * </div>
     *
     * <div class="content-inner">
     *
     *
     *
     *
     * <div class="question">
     * <h2 class="question-title">18-19 赛季欧冠 1/8 决赛首回合曼联主场 0:2 不敌巴黎圣日耳曼，如何评价两队的表现？</h2>
     *
     * <div class="answer">
     *
     * <div class="meta">
     * <img class="avatar" src="http://pic3.zhimg.com/v2-88ae81f67fc3c37ada0ac8eb6203faf2_is.jpg">
     * <span class="author">开水没温度，</span><span class="bio">自由撰稿人</span>
     * </div>
     *
     * <div class="content">
     * <p>我说下自己的看法，主要说三点：</p>
     * <p>第一，为何曼联进攻完全没有章法。</p>
     * <p>这个，其实在此前比赛已经展现出了这个问题，说到底就是曼联如今的战术打法已经遭遇到对手的持续性、强化的限制。</p>
     * <p>索尔斯克亚的进攻解放运动，让曼联的攻击群几乎被全部激活，而表现最好的球员当属博格巴、拉什福德、马夏尔。这三名球员中，拉什福德逐渐被固定位进攻终端，需要与博格巴等人进行配合，在后者成为轮转核心的同时，马夏尔的游弋、突破就成为进攻的提速以及爆点关键。从深层次来看，博格巴与马夏尔的发挥成为曼联进攻的基石性关键，而拉什福德就成为这个体系中一个前场的移动杀手。</p>
     * <p>当这个战术体系不断取得效果的同时，也开始遭遇到对手的严密限制。从贝尼特斯开始，普埃尔等人就逐渐开始找到了曼联进攻组织的命门并给与限制，红魔的进攻也从索肖接手初期的大杀四方开始相对“黯淡”。</p>
     * <p><img class="content-image" src="http://pic3.zhimg.com/70/v2-41794aee93040d832d49dfb428ce308a_b.gif" alt=""></p>
     * <p>图 1：从限制博格巴的传递路线到不让他接球，英超诸强逐渐瞄准曼联进攻命门</p>
     * <p>在这种情况下，曼联依靠球星的个人能力、索尔斯克亚的关键换人不断收获进球，在一定程度上掩盖了一些问题。只是，这种问题已经逐渐得到了舆论的认可，索尔斯克亚与曼联也变得压力骤增。</p>
     * <p>这时候的曼联，不惧怕对手展现开放态势进行对攻，而不适应对手给与博格巴、马夏尔等人进行针对性的限制。因此，曼联能在进攻端逐渐呈现问题的时候客场 3-0 取胜富勒姆，也能在今天凌晨 0-2 输给大巴黎。</p>
     * <p>不过，大巴黎的限制思路，要更加激进，而且限制的更加全面。</p>
     * <p><img class="content-image" src="http://pic3.zhimg.com/70/v2-39ae6d24fab4fa9912301bd61bf3d902_b.gif" alt=""></p>
     * <p>图 2：不同于贝尼特斯，图赫尔的限制更加全面</p>
     * <p>上图下端左侧是纽卡斯尔对阵曼联比赛中的限制思路，主要将限制兵力放在博格巴与马夏尔活动的区域，然后在禁区线外的高位进行了大量的拦截；上图下端右侧是大巴黎上半程比赛的拦截分布，我们可以清晰地看到曼联进攻强侧（博格巴 + 马夏尔）在高位遭遇到了明显的限制。</p>
     * <p>而从上图更可以看到，马基尼奥斯对于博格巴的盯防十分严密，而马夏尔在回撤接球的同时，也遭遇到了科雷尔的前提限制。也就是说，大巴黎的高位限制策略瞄准的博格巴与马夏尔两个强点，也让曼联的进攻推进变得缺乏办法。这时候，拉什福德就不得不频繁冲刺去接长传球，缺乏足够空间的情况下效果自然不好。</p>
     * <p>第二，为何曼联的逼抢没有效果，尤其是大巴黎中场看起来缺人</p>
     * <p>曼联中场只有埃雷拉一个机动点，在很大程度上决定了球队的覆盖存在一定的短板，在这时候进行高压逼抢，就很容易遭遇到对手的冲击。大巴黎在经历了曼联开场高压逼抢的不适之后，逐渐通过有效的传递以及前场球员的机动性，展现出效果。这种效果，瞄准的就是曼联逼抢时阵型脱节带来的问题。</p>
     * <p><img class="content-image" src="http://pic2.zhimg.com/70/v2-8a0a81e5f546217b90cd126fa0b3b9c9_b.gif" alt=""></p>
     * <p><img class="content-image" src="http://pic4.zhimg.com/70/v2-b45de697358e1cdace7e3e42a4f75c03_b.gif" alt=""></p>
     * <p>图 3+4：上下半场，大巴黎都开始利用有效的传递破开曼联的前场逼抢，然后在控制与提速冲击中进行转换。当大巴黎掌控球权的时候，曼联在高位增加的逼抢并没有限制对手的组织推进。中前场与防线之间的空挡，遭遇到对手的严密打击。</p>
     * <p>而且，曼联的逼抢策略最大限度暴露出了球队中场前提之后与防线之间空挡的问题。</p>
     * <p><img class="content-image" src="http://pic2.zhimg.com/70/v2-4b711ecf059ed031215ddd96ecb1c46d_b.gif" alt=""></p>
     * <p>图 5：中场与后卫之间的衔接区域被不断打击，曼联阵地防线一旦松散就问题巨大</p>
     * <p>小德与迪玛利亚开始从抱边到内收，标志着大巴黎进攻策略的转移。曼联高位逼抢线下中场机动点前提之后缺乏覆盖保护的问题再度展现，让小德与迪玛利亚在内收之后频繁获得肋部作业的空间。这时候，大巴黎可以直塞找前插的姆巴佩，也可以分边找这时候前提的边翼卫。大巴黎第一个进球（角球战术），就是来自小德内收与姆巴佩前插之后前提边翼卫在边路巨大空挡后的空位传中。</p>
     * <p>第三，曼联最后时刻破大巴黎的逼抢为啥没有此前好用？</p>
     * <p>放走费莱尼，很大程度是索尔斯克亚如今的战术体系已经没有比利时人的位置。因为，在此前的进攻中，曼联在破对手低位防线时更多地寻求肋部的冲击。这个战术的关键点，在于机动点去冲击对手的防线肋部。</p>
     * <p><img class="content-image" src="http://pic2.zhimg.com/70/v2-63078ac675520f9ee7741ee00bf7eb49_b.gif" alt=""></p>
     * <p>图 6：强调高位主导以及肋部冲击，这就是索尔斯克亚面对低位大巴的手段</p>
     * <p>只是，林加德、马夏尔的受伤下场以及桑切斯持球、突击能力的下滑，已经很难突破大巴黎的五后卫防线。在卢卡库登场时间较晚以及大巴黎针对性的封锁下，缺乏有效传跑的曼联在边路很难完成有效的配合，而且最为关键的冲击对手肋部的机动点，没有了。</p>
     * <p><img class="content-image" src="http://pic1.zhimg.com/70/v2-ce32ca500ace5b0a38808f329ebcf50c_b.gif" alt=""></p>
     * <p>图 7：遭遇包夹，曼联很难突破大巴黎的边路封锁</p>
     * <p>因此，曼联本场比赛输的借口并不多。不过，能在强强对话中暴露出问题，有利于球队进行分析总结。只是，接下来连续强强对话，调整时间并不是很多，这才是考验</p>
     * </div>
     * </div>
     *
     * <div class="answer">
     *
     * <div class="meta">
     * <img class="avatar" src="http://pic2.zhimg.com/v2-5790d84944596a378db4cca66e5f3565_is.jpg">
     * <span class="author">海布里de酋长，</span><span class="bio">未来媒体人（体育、影视、文学）</span>
     * </div>
     *
     * <div class="content">
     * <p>本场曼联排出了 4-3-1-2 的阵型，巴黎则是 4-3-3 阵容。具体站位见下图:</p>
     * <p><img class="content-image" src="http://pic1.zhimg.com/70/v2-a27d386b00eb158b21836a25e42d6a84_b.gif" alt=""></p>
     * <p><img class="content-image" src="http://pic3.zhimg.com/70/v2-053137972d0ade4d7fbd717ee51c0eca_b.gif" alt=""></p>
     * <p>我就单说下值得注意点:巴黎这边因为内马尔和卡瓦尼的缺阵，<strong>姆巴佩打中锋</strong>，<strong>迪玛利亚居左</strong>，攻击能力很强的右后卫<strong>阿尔维斯</strong>今天出现在<strong>右边锋</strong>的位置上。以及，<strong>中卫出身的马尔基尼奥斯打后腰</strong>，算上金彭贝和弟媳，巴黎有至少三名关键区域的中路防守球员，必要的时候可以演变为三中卫……而曼联和以往最大的不同就是<strong>4-3-3 阵型没有一个明确的前腰位置，但今天 4-3-1-2 的时候林加德是打这个位置的。而按道理马夏尔和拉什福德的双前锋搭档战术上层次会更多变。</strong></p>
     * <p><strong>开场后大巴黎一如既往，选择以后场短传推进的方式组织进攻，而曼联还以很有侵略性的高位逼抢，取得了一定的效果。</strong>上半场裁判的吹罚尺度很严格，一共出示了 5 张黄牌。总体来说，曼联的上半场是占据优势的一方，但无奈没有转化为进球。</p>
     * <p><img class="content-image" src="http://pic1.zhimg.com/70/v2-ba5ada1e86a5c56a062918eac3139610_b.gif" alt=""></p>
     * <p><img class="content-image" src="http://pic1.zhimg.com/70/v2-61b76bf36b03d083897733c7e70a5d68_b.gif" alt=""></p>
     * <p>一个中规中矩的半场，双方各自的问题有:</p>
     * <p><strong>曼联方面进攻端博格巴位置比较靠后，不能更好的发挥其最后一传和远射的作用。</strong>另一点可能是由于忌惮巴黎的进攻，曼联三叉戟相互间的接应变化比较少，<strong>而防守端阿什利.扬这个点在拿到黄牌后成为巴黎主要针对的对象。</strong></p>
     * <p><img class="content-image" src="http://pic1.zhimg.com/70/v2-571b8afcde5aa1e86444fadf595b72b8_b.gif" alt=""></p>
     * <p><img class="content-image" src="http://pic3.zhimg.com/70/v2-1f95c096e5093bbbac514b9ee578b956_b.gif" alt=""></p>
     * <p><strong>巴黎方面进攻端没有内马尔，缺乏一个靠谱的组织 + 推进者，维拉蒂长于组织但短于推进，迪玛利亚强于推进但弱于组织。</strong>且卡瓦尼受伤后球队没有一个特别靠谱的高点。进攻很依赖姆巴佩拉边后利用速度打身后，阵地战套路相对单一。<strong>而防守上后场短传推进的方式面对曼联的高压容易产生失误。而整体防守人员能力有一定缺陷（围绕传控能力打造的后场，在法甲没有问题，欧冠强强对话时有隐患） </strong></p>
     * <p><strong>然而这种均势因为林加德的意外受伤被打破了</strong>（可能是为前面马夏尔身体不适准备的）桑切斯换下了他。然后由于桑切斯和马夏尔两个都是右脚将，不太适应右边路。半场回来索尔斯克亚选择用马塔替下马夏尔来平衡整体阵型。</p>
     * <p>而遗憾的是，今天无论是桑切斯还是马塔都没有达到他们的正常水准，索帅的两个换人可以说是以失败收场的。<strong>蝴蝶效应</strong>，因为林加德的受伤过早用掉了两个换人名额，卢卡库这张有战略价值的牌也迟迟打不出来……</p>
     * <p><strong>反观巴黎虽然人员吃紧，但下半场有了两个良好的变化:</strong></p>
     * <p><strong>一是德勒克斯勒做了部分内马尔的活，在中路更多的接应，串联。阿尔维斯在右边得以更好的起球传中，迪玛利亚的位置也不在死板的站在左边，可以和队友产生新的战术变化。</strong>在那个角球破门前大巴黎的边路进攻已经有了一定的突破，金庞贝的破门只是水到渠成。</p>
     * <p><img class="content-image" src="http://pic3.zhimg.com/70/v2-1f318f9b17e475c3776828bddf228302_b.gif" alt=""></p>
     * <p><img class="content-image" src="http://pic2.zhimg.com/70/v2-cc2d494884b0e29e91eda2019bf3f1ad_b.gif" alt=""></p>
     * <p>二是在 1:0 领先后，一贯后场短传推进，喜欢控球的大巴黎，开始用更多的<strong>简洁的长传反击找姆巴佩</strong>，然后利用他的速度优势形成单刀的机会。第二个进球正是贝尔纳特——迪玛利亚——姆巴佩两脚快速传递后的射门得分。</p>
     * <p><img class="content-image" src="http://pic4.zhimg.com/70/v2-f328dc7816b085a8237dedb41b0264ff_b.gif" alt=""></p>
     * <p>另，前文提到的巴黎这个阵型一个有意思的地方，中卫出身的马尔基尼奥打后腰的部署。整场下来看图赫尔并没有为转变为三中卫而使用。<strong>但他起到了至关重要的作用:冻结了博格巴，释放了维拉蒂，让防守职能减轻后的意大利人完成了整场比赛高达 94%的传球成功率。</strong></p>
     * <p><strong>所以是马尔基尼奥斯的盯人，金庞贝一如既往的稳定，维拉蒂的疏导，迪玛利亚的突进、致命一传，德拉克斯勒的接应，阿尔维斯的右路威胁和姆巴佩的速度与个人能力一起帮助大巴黎今天能在老特拉福德全身而退。</strong></p>
     * <p>而对于曼联，主场净负两球，且让对方打入两个客场进球，波霸停赛，下回合在王子公园球场比赛的压力将会非常之大……</p>
     * </div>
     * </div>
     *
     *
     * <div class="view-more"><a href="http://www.zhihu.com/question/312049110">查看知乎讨论<span class="js-question-holder"></span></a></div>
     *
     * </div>
     *
     *
     * </div>
     * </div><script type=“text/javascript”>window.daily=true</script>
     * image_source : annca / CC0
     * title : 面对缺兵少将的大巴黎，红魔暴露了弱点
     * image : https://pic3.zhimg.com/v2-205312353d810a072ffa9a2541d9010a.jpg
     * share_url : http://daily.zhihu.com/story/9707493
     * js : []
     * ga_prefix : 021318
     * images : ["https://pic2.zhimg.com/v2-b480ec75082d344ef221c9a54d78f8b1.jpg"]
     * type : 0
     * id : 9707493
     * css : ["http://news-at.zhihu.com/css/news_qa.auto.css?v=4b3e3"]
     */

    private String body;
    private String image_source;
    private String title;
    private String image;
    private String share_url;
    private String ga_prefix;
    private int type;
    private int id;
    private List<String> js;
    private List<String> images;
    private List<String> css;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage_source() {
        return image_source;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getJs() {
        return js;
    }

    public void setJs(List<String> js) {
        this.js = js;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getCss() {
        return css;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }
}
