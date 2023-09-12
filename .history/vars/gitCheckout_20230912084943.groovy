def call(Map stageParams){
    checkout([
        $class: 'GITSCM'
        branches: [[name: stageParams.branche]],
        userRemoteConfigs: [[url: stageParams.url]]
    ])
}